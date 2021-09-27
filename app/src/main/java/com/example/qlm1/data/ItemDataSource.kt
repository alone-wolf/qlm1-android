package com.example.qlm1.data

class ItemDataSource {
    companion object {
        fun fake(): List<Item> {
            return listOf(
                Item("", "", "", "", ""),
                Item("", "", "", "", ""),
                Item("", "", "", "", ""),
                Item("", "", "", "", ""),
            )
        }
    }
}