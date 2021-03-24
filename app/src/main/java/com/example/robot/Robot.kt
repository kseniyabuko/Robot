package com.example.robot

import com.example.robot.hands.IHand
import com.example.robot.heads.IHead
import com.example.robot.legs.ILeg

class Robot(private var hand: IHand, private var head: IHead, private var leg: ILeg) : IRobot {

    override fun action() {
        head.speak()
        hand.upHand()
        leg.step()
    }

    override fun getPrice(): Int {
        return head.getPrice() + hand.getPrice() + leg.getPrice()
    }
}