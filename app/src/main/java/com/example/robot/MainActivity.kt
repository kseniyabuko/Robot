package com.example.robot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.robot.hands.SamsungHand
import com.example.robot.hands.SonyHand
import com.example.robot.hands.ToshibaHand
import com.example.robot.heads.SamsungHead
import com.example.robot.heads.SonyHead
import com.example.robot.heads.ToshibaHead
import com.example.robot.legs.SamsungLeg
import com.example.robot.legs.SonyLeg
import com.example.robot.legs.ToshibaLeg

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var samsungHand1 = SamsungHand(140)
        var sonyHand1 = SonyHand(110)
        var toshibaHand1 = ToshibaHand(120)

        var samsungHead1 = SamsungHead(220)
        var sonyHead1 = SonyHead(250)
        var toshibaHead1 = ToshibaHead(280)

        var samsungLeg1 = SamsungLeg(320)
        var sonyLeg1 = SonyLeg(330)
        var toshibaLeg1 = ToshibaLeg(360)

        var robot1 = Robot(samsungHand1, toshibaHead1, sonyLeg1)
        robot1.action()
        robot1.getPrice()

        var robot2 = Robot(toshibaHand1, samsungHead1, samsungLeg1)
        robot2.action()
        robot2.getPrice()

        var robot3 = Robot(sonyHand1, sonyHead1, toshibaLeg1)
        robot3.action()
        robot3.getPrice()

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            println("Price of Robot1 is max")
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            println("Price of Robot2 is max")
        } else
            println("Price of Robot3 is max")
    }
    }