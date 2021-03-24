package com.example.robot.legs

class ToshibaLeg(i: Int) : ILeg {
    private var price: Int = 0

    override fun step() {
    println("Toshiba leg is stepping")    }

    override fun getPrice(): Int {
    return price    }

}