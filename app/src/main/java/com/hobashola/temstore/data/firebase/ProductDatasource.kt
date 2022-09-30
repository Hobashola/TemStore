package com.hobashola.temstore.data.firebase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.hobashola.temstore.data.models.Product

class ProductDatasource {
    private val db = Firebase.firestore

   fun getProductsInfo(): MutableLiveData<List<Product>>{
       val productLiveData = MutableLiveData<List<Product>>()

       db.collection("products")
           .get()
           .addOnSuccessListener { documents ->
               val listOfProducts: List<Product> = documents.toObjects(Product::class.java)
               productLiveData.value = listOfProducts
           }
           .addOnFailureListener { error ->
               Log.e("Firebase Error", error.message.toString())
           }
       return productLiveData
   }
}