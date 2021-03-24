package com.example.robot.heads

class ToshibaHead(i: Int) : IHead {
    private var price: Int = 0

    override fun speak() {
        println("Toshiba head is speaking")
    }

    override fun getPrice(): Int {
        return price
    }

}