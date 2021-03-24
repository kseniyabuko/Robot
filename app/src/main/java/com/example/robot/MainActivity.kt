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
        var sonyHand1 = SonyHand (110)
        var toshibaHand1 = ToshibaHand (120)

        var samsungHead1 = SamsungHead (220)
        var sonyHead1 = SonyHead (250)
        var toshibaHead1 = ToshibaHead (280)

        var samsungLeg1 = SamsungLeg (320)
        var sonyLeg1 = SonyLeg (330)
        var toshibaLeg1 = ToshibaLeg (360)

        var robot1 = Robot (samsungHand1, toshibaHead1, sonyLeg1)
        robot1.action()
        println (robot1.getPrice())

    }
}