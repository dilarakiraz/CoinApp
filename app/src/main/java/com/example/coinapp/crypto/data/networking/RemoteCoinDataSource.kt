package com.example.coinapp.crypto.data.networking

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.coinapp.core.data.networking.constructUrl
import com.example.coinapp.core.data.networking.safeCall
import com.example.coinapp.core.domain.util.NetworkError
import com.example.coinapp.core.domain.util.Result
import com.example.coinapp.core.domain.util.map
import com.example.coinapp.crypto.data.mappers.toCoin
import com.example.coinapp.crypto.data.mappers.toCoinPrice
import com.example.coinapp.crypto.data.networking.dto.CoinHistoryDto
import com.example.coinapp.crypto.data.networking.dto.CoinsResponseDto
import com.example.coinapp.crypto.domain.Coin
import com.example.coinapp.crypto.domain.CoinDataSource
import com.example.coinapp.crypto.domain.CoinPrice
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import java.time.ZoneId
import java.time.ZonedDateTime

class RemoteCoinDataSource(
    private val httpClient: HttpClient
) : CoinDataSource {

    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError> {
        val startMillis = start
            .withZoneSameInstant(ZoneId.of("UTC"))
            .toInstant()
            .toEpochMilli()
        val endMillis = end
            .withZoneSameInstant(ZoneId.of("UTC"))
            .toInstant()
            .toEpochMilli()

        return safeCall<CoinHistoryDto> {
            httpClient.get(
                urlString = constructUrl("/assets/$coinId/history")
            ) {
                parameter("interval", "h6")
                parameter("start", startMillis)
                parameter("end", endMillis)
            }
        }.map { response ->
            response.data.map { it.toCoinPrice() }
        }
    }
}