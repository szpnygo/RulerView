package com.neobaran.app.ruler

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        height_input.setUnitStr("cm")
        height_number.text = "188.6 cm"
        height_input.setValueListener {
            height_number.text = "$it cm"
            val height = height_input.getValue() // get the rule current value
        }


        //set the number precision, it should be called before setMin / setMax / setValue
        //设置精度，如40.5 40.55 必须在设置最大/最小值/当前值 之前调用
        weight_input.setDigits(1)
        weight_input.setValue(78.8f)           //set the current value
        weight_input.setMinValue(10)           //set the min value
        weight_input.setMaxValue(220)          //set the max value

        weight_number.text = "78.8 kg"
        weight_input.setValueListener {
            weight_number.text = "$it kg"
        }


    }
}
