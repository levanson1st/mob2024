package com.example.mycity

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class Recommendation(
    val id: String,
    val imageResId: Int,
    val text: String
)

data class Category(
    val id: String,
    val name: String,
    val imageResId: Int,
    val recommendations: List<Recommendation>
)

class CityViewModel : ViewModel() {
    private val _categories = MutableStateFlow<List<Category>>(emptyList())
    val categories: StateFlow<List<Category>> get() = _categories

    init {
        // Example data
        _categories.value = listOf(
            Category(
                id = "1",
                name = "Parks",
                imageResId = R.drawable.park_icon,
                recommendations = listOf(
                    Recommendation("1", R.drawable.peacepark, "Peaces park"),
                    Recommendation("2", R.drawable.cau_giay_park, "Cau giay park")
                )
            ),
            Category(
                id = "2",
                name = "Shopping centers",
                imageResId = R.drawable.shopping_center_icon,
                recommendations = listOf(
                    Recommendation("3",  R.drawable.royalcity, "Royal city"),
                    Recommendation("4", R.drawable.bigc, "Bigc Thang Long")
                )
            ),
            Category(
                id = "3",
                name = "Places to go",
                imageResId = R.drawable.places_icon,
                recommendations = listOf(
                    Recommendation("5",  R.drawable.walking_street, "walking street"),
                    Recommendation("6",  R.drawable.west_lake, "West lake")
                )
            )
        )
    }
}