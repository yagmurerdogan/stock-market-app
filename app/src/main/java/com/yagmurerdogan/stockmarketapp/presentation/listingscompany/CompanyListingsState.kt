package com.yagmurerdogan.stockmarketapp.presentation.listingscompany

import com.yagmurerdogan.stockmarketapp.domain.model.CompanyListing
import com.yagmurerdogan.stockmarketapp.util.extensions.EMPTY_STRING

data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = EMPTY_STRING
)
