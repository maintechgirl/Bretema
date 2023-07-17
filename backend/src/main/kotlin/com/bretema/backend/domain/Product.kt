package com.bretema.backend.domain

import jakarta.persistence.*


@Table(name = "products")
@Entity
class Product (
    @Id
    @GeneratedValue
    var id: Long,
    var name: String,
    var color: String,
    var quantity: Int,
    var imageUrl: String,
)