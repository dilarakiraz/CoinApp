package com.example.coinapp.crypto.domain

import com.example.coinapp.core.domain.util.NetworkError
import com.example.coinapp.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}