package com.example.robot.legs

class SamsungLeg(i: Int) : ILeg {
    private var price: Int = 0

    override fun step() {
        println("Samsung leg is stepping")
    }

    override fun getPrice(): Int {
        return price
    }


}