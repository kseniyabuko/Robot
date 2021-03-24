package com.example.robot.heads

class SonyHead(i: Int) : IHead {
    private var price: Int = 0

    override fun speak() {
        println("Sony head is speaking")
    }

    override fun getPrice(): Int {
        return price
    }

}