package com.example.coinapp.crypto.data.networking

import com.example.coinapp.core.data.networking.constructUrl
import com.example.coinapp.core.data.networking.safeCall
import com.example.coinapp.core.domain.util.NetworkError
import com.example.coinapp.core.domain.util.Result
import com.example.coinapp.core.domain.util.map
import com.example.coinapp.crypto.data.mappers.toCoin
import com.example.coinapp.crypto.data.networking.dto.CoinsResponseDto
import com.example.coinapp.crypto.domain.Coin
import com.example.coinapp.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

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
}