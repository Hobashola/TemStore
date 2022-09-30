package com.hobashola.temstore.data.repository

import androidx.lifecycle.MutableLiveData
import com.hobashola.temstore.data.firebase.ProductDatasource
import com.hobashola.temstore.data.models.Product

class ProductsRepository {

    fun getProducts(): MutableLiveData<List<Product>>{
        val productDatasource = ProductDatasource()

        return productDatasource.getProductsInfo()
    }
}