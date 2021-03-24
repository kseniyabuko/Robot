package com.example.robot.hands

class SamsungHand(i: Int) : IHand {
    private var price: Int = 0

    override fun upHand() {
        println("Samsung hand is up")
    }

    override fun getPrice(): Int {
        return price
    }

}