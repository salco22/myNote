package com.digitalmodularbanking.mynote.feature.domain.utils

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
