package com.myappcompany.doglistapp

import java.io.Serializable

data class DogModel(val imageResId: Int,
                    val name: String,
                    val description: String,
                    val url: String,
                    val text: String = ""): Serializable
