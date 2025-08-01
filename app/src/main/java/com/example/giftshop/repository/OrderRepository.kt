package com.example.giftshop.repository

import com.example.giftshop.model.OrderModel

interface OrderRepository {
    fun placeOrder(order: OrderModel, callback: (Boolean, String) -> Unit)
    fun getOrdersByUser(userId: String, callback: (List<OrderModel>, Boolean, String) -> Unit)
    fun cancelOrder(orderId: String, callback: (Boolean, String) -> Unit)

    // New method to get all orders
    fun getAllOrders(callback: (List<OrderModel>, Boolean, String) -> Unit)
}
