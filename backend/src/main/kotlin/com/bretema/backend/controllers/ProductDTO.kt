package com.bretema.backend.controllers


import com.bretema.backend.domain.Product
import java.util.*


data class ProductDTO(
    var name: String,
    var color: String,
    var quantity: Int,
    var imageUrl: String,
    var id: UUID
) {
    companion object {
        fun from(product: Product) = with(product) {
            ProductDTO(name, color, quantity, imageUrl, id)
        }
    }
}



