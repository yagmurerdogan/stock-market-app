package com.yagmurerdogan.stockmarketapp.di

import com.yagmurerdogan.stockmarketapp.data.csv.CSVParser
import com.yagmurerdogan.stockmarketapp.data.csv.CompanyListingParser
import com.yagmurerdogan.stockmarketapp.data.csv.IntradayInfoParser
import com.yagmurerdogan.stockmarketapp.data.repository.StockRepositoryImpl
import com.yagmurerdogan.stockmarketapp.domain.model.CompanyListing
import com.yagmurerdogan.stockmarketapp.domain.model.IntradayInfo
import com.yagmurerdogan.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}