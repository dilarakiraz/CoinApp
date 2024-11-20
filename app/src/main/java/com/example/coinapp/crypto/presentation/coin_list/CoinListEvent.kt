package com.example.coinapp.crypto.presentation.coin_list

import com.example.coinapp.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}