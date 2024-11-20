package com.example.coinapp.di

import com.example.coinapp.core.data.networking.HttpClientFactory
import com.example.coinapp.crypto.data.networking.RemoteCoinDataSource
import com.example.coinapp.crypto.domain.CoinDataSource
import com.example.coinapp.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module


val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}