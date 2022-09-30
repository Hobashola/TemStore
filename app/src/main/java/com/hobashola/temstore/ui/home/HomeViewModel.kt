package com.hobashola.temstore.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hobashola.temstore.data.models.Product
import com.hobashola.temstore.data.repository.ProductsRepository

class HomeViewModel : ViewModel() {
    private val productsRepository = ProductsRepository()
    private val products: MutableLiveData<List<Product>> = productsRepository.getProducts()

    fun getAllProduct(): MutableLiveData<List<Product>> {
        return products
    }

}
