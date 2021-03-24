package com.example.robot.hands

class ToshibaHand(i: Int) : IHand {
    private var price: Int = 0

    override fun upHand() {
        println("Toshiba hand is up")
    }

    override fun getPrice(): Int {
        return price
    }
}