package com.example.robot.heads

class SamsungHead(i: Int) : IHead {
    private var price: Int = 0

    override fun speak() {
    println ("Samsung head is speaking")
    }

    override fun getPrice(): Int {
        return price
    }


}