package com.example.coinapp.crypto.presentation.coin_list

import com.example.coinapp.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}