package com.example.temperaturescale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Calc(v: View) {
        var n1 = findViewById<EditText>(R.id.num) as EditText
        val re = findViewById<TextView>(R.id.res) as TextView
        val number1:Float
        val result: Float

        if (TextUtils.isEmpty(n1.text.toString())){
            n1.error="Enter your Temperature..."
            return
        }
        else{
            number1= n1.text.toString().toFloat()
        }
        when(v.id){
            R.id.K->{
                result=number1+273
                re.text=result.toString()
            }
            R.id.F->{
                result=9*number1/5+32
                re.text=result.toString()
            }
            R.id.C->{
                result=((number1-273)/5)*5
                re.text=result.toString()
            }
            R.id.F2->{
                result=((number1-273)/5)*9+32
                re.text=result.toString()
            }
            R.id.C2->{
                result=((number1-32)/9)*5
                re.text=result.toString()

            }
            R.id.K2->{
                result=((number1-32)/9)*5+273
                re.text=result.toString()
            }

        }
    }
}