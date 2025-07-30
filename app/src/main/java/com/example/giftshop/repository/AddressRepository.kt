package com.example.giftshop.repository

import com.example.giftshop.model.AddressModel

interface AddressRepository {
    fun addAddress(address: AddressModel, callback: (Boolean, String) -> Unit)
    fun getAddresses(userId: String, callback: (List<AddressModel>) -> Unit)
    fun updateAddress(address: AddressModel, callback: (Boolean, String) -> Unit)
    fun deleteAddress(addressId: String, callback: (Boolean, String) -> Unit)
}
