package com.example.robot.hands

class SonyHand (i: Int) : IHand {
    private var price: Int = 0

    override fun upHand() {
        println("Sony hand is up")
    }

    override fun getPrice(): Int {
        return price
    }
}