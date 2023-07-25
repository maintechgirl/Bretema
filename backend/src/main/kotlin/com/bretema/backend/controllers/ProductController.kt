package com.bretema.backend.controllers

import com.bretema.backend.domain.Product
import com.bretema.backend.repositories.ProductRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.server.ResponseStatusException
import java.util.*
import kotlin.jvm.optionals.getOrNull


@RestController
@CrossOrigin
class ProductController(private val productRepository: ProductRepository) {

    @GetMapping("/")
    fun allproducts(@RequestParam search: String?): List<ProductDTO> {
        if (!search.isNullOrBlank()) {
            val filteredProducts = productRepository.findByNameContainingIgnoreCase(search)
            return filteredProducts.map { ProductDTO.from(it) }
        }
        return productRepository.findAll().map { ProductDTO.from(it) }
    }

    @GetMapping("/{id}")
    fun productById(@PathVariable id: String): ProductDTO? {
        val product = productRepository
            .findById(UUID.fromString(id))
            .getOrNull()
        if (product == null) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND)
        }
        return ProductDTO.from(product)
    }

    @PostMapping("/")
    fun addProduct(@RequestBody product: Product): ResponseEntity<Product> {
        try {
            val savedProduct = productRepository.save(product)
            return ResponseEntity.ok(savedProduct)
        } catch (ex: Exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
        }
    }

    @PostMapping("/{id}")
    fun updateProduct(
        @PathVariable id: String,
        @RequestBody updatedProduct: Product
    ): ResponseEntity<Product> {
        val product = productRepository.findById(UUID.fromString(id)).getOrNull()

        if (product == null) {
            return ResponseEntity.notFound().build()
        }
        product.name = updatedProduct.name
        product.color = updatedProduct.color
        product.quantity = updatedProduct.quantity
        product.imageUrl = updatedProduct.imageUrl

        val updatedProduct = productRepository.save(product)
        return ResponseEntity.ok(updatedProduct)
    }

    @DeleteMapping("/{id}")
    fun deleteProductById(@PathVariable id: String): ProductDTO? {
        val product = productRepository
            .findById(UUID.fromString(id))
            .getOrNull()
        if (product == null) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND)
        }
        productRepository.delete(product)
        return ProductDTO.from(product)
    }
}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "product not found")
class ProductNotFoundException : RuntimeException()