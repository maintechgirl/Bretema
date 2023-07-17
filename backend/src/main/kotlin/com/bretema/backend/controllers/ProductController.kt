package com.bretema.backend.controllers

import com.bretema.backend.domain.Product
import com.bretema.backend.repositories.ProductRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
class ProductController (private val productRepository: ProductRepository) {

    @GetMapping("/catalog")
    fun getAllProducts(): List<Product> = productRepository.findAll()

   @GetMapping("/catalog/{id}")
    fun findProductById(@PathVariable id: Long): Product? {
        return productRepository.findById(id).orElseThrow { ProductNotFoundException() }
    }

    @PostMapping("/catalog")
    fun addProduct(@RequestBody product: Product): Product? {
        return productRepository.save(product)
    }

}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "product not found")
class ProductNotFoundException : RuntimeException()