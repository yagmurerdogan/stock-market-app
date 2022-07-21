package com.yagmurerdogan.stockmarketapp.domain.repository

import com.yagmurerdogan.stockmarketapp.domain.model.CompanyInfo
import com.yagmurerdogan.stockmarketapp.domain.model.CompanyListing
import com.yagmurerdogan.stockmarketapp.domain.model.IntradayInfo
import com.yagmurerdogan.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}