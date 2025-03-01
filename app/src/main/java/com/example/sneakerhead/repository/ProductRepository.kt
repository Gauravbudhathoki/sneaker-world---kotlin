package com.example.sneakerhead.repository

import ProductModel
import android.net.Uri
import com.google.firebase.database.core.Context

interface ProductRepository {

//    {
//        "success":true
//        "message": "Product added successfully"
//    }

    fun addProduct(productModel: ProductModel,
                   callback:(Boolean,String) -> Unit
    )

    fun updateProduct(productId:String,
                      data: MutableMap<String,Any>,
                      callback: (Boolean, String) -> Unit)

    fun deleteProduct(productId:String,
                      callback: (Boolean, String) -> Unit)

    fun getProductById(productId:String,
                       callback: (ProductModel?, Boolean,
                                  String) -> Unit)

    fun getAllProduct(callback:
                          (List<ProductModel>?,Boolean,
                           String) -> Unit)

    fun uploadImage(context: android.content.Context, imageUri: Uri, callback: (String?) -> Unit)

    fun getFileNameFromUri(context: Context, uri: Uri): String?

}