package com.yagmurerdogan.stockmarketapp.presentation.listingscompany

sealed class CompanyListingsEvent {
    object Refresh : CompanyListingsEvent()
    data class OnSearchQueryChange(val query: String) : CompanyListingsEvent()
}
