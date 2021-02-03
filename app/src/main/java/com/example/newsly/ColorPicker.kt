package com.example.newsly

object ColorPicker {
    val colors = arrayOf(
        "#000000",
        "#000080",
        "#00008B",
        "#0000CD",
        "#0000FF",
        "#006400",
        "#008000",
        "#008080",
        "#008B8B",
        "#00BFFF",
        "#00CED1",
        "#00FA9A",
        "#00FF00",
        "#00FF7F",
        "#00FFFF",
        "#00FFFF",
        "#191970"
    )
    var colorIndex = 1
    fun getColor(): String{
        return colors[colorIndex++% colors.size]
    }
}
