package com.example.swag_store.Services

import com.example.swag_store.model.Category
import com.example.swag_store.model.Product

object DataService {
    val category = listOf(
        Category("SHIRT","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodimage"),
        Category("SHIRT","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodimage"),
        Category("SHIRT","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodimage")
    )
    val hat = listOf(
        Product("Graphic hat","Rs 1000","hat01"),
        Product("Black hat","Rs 900","hat02"),
        Product("White hat","Rs 1200","hat03"),
        Product("Snapback hat","Rs 1500","hat04")
    )
    val hoodies = listOf(
        Product("Gray hoodie","Rs 1600","hoodie01"),
        Product("White hoodie","Rs 1300","hoodie02"),
        Product("Black hoodie","Rs 1100","hoodie03"),
        Product("Red hoodie","Rs 1500","hoodie04")

    )
    val shirts = listOf(
        Product("Black shirt","Rs 400","shirt01"),
        Product("white shirt","Rs 450","shirt02"),
        Product("Gray shirt","Rs 300","shirt03"),
        Product("badge light blue","Rs 350","shirt04")
    )

}
