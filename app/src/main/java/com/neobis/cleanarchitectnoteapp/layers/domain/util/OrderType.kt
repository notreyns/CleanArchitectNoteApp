package com.neobis.cleanarchitectnoteapp.layers.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}