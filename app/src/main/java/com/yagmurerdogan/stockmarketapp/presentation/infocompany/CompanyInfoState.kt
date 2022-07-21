package com.yagmurerdogan.stockmarketapp.presentation.infocompany

import com.yagmurerdogan.stockmarketapp.domain.model.CompanyInfo
import com.yagmurerdogan.stockmarketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)