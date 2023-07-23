package com.bretema.backend.domain

import jakarta.persistence.*
import java.util.*


@Table(name = "products")
@Entity
class Product (
    @Id
    var id: UUID,
    var name: String,
    var color: String,
    var quantity: Int,
    var imageUrl: String
)