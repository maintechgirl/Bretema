package com.bretema.backend.controllers

import com.bretema.backend.domain.Product
import com.bretema.backend.repositories.ProductRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
class ProductController (private val productRepository: ProductRepository) {

    @GetMapping("/")
    fun getAllProducts(): List<Product> = productRepository.findAll()

   @GetMapping("/{id}")
    fun findProductById(@PathVariable id: Long): Product? {
        return productRepository.findById(id).orElseThrow { ProductNotFoundException() }
    }

    @PostMapping("/")
    fun addProduct(@RequestBody product: Product): Product? {
        return productRepository.save(product)
    }

    @PutMapping("/")
    fun updateProductById(@RequestBody product: Product): Product? {
        product.id?.let { productRepository.findById(it).orElseThrow { ProductNotFoundException() } }
        return productRepository.save(product)
    }

    @DeleteMapping("/{id}")
    fun deleteProductById(@PathVariable id: Long): Product? {
        val product: Product = productRepository.findById(id).orElseThrow { ProductNotFoundException() }
        productRepository.deleteById(id)
        return product
    }
}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "product not found")
class ProductNotFoundException : RuntimeException()