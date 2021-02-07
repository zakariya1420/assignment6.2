package com.example.home2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var total0: TextView = findViewById(R.id.totalcre)
        var gpa: TextView = findViewById(R.id.gpa)
        var sub1: EditText =findViewById(R.id.subject1)
        var sub2: EditText =findViewById(R.id.subject2)
        var sub3: EditText =findViewById(R.id.subject3)
        var sub4: EditText =findViewById(R.id.subject4)
        var sub5: EditText =findViewById(R.id.subject5)
        var cru1: EditText =findViewById(R.id.crudit1)
        var cru2: EditText =findViewById(R.id.crudit2)
        var cru3: EditText =findViewById(R.id.crudit3)
        var cru4: EditText =findViewById(R.id.crudit4)
        var cru5: EditText =findViewById(R.id.crudit5)
        var point1: EditText =findViewById(R.id.point1)
        var point2: EditText =findViewById(R.id.point2)
        var point3: EditText =findViewById(R.id.point3)
        var point4: EditText =findViewById(R.id.point4)
        var point5: EditText =findViewById(R.id.point5)
        var btnok: Button =findViewById(R.id.ok)
        var btnclear: Button =findViewById(R.id.clear)
        btnok.setOnClickListener(){
            var sub1 = sub1.text.toString()
            var sub2 = sub2.text.toString()
            var sub3 = sub3.text.toString()
            var sub4 = sub4.text.toString()
            var sub5 = sub5.text.toString()
            var cru1 = cru1.text.toString()
            var cru2 = cru2.text.toString()
            var cru3 = cru3.text.toString()
            var cru4 = cru4.text.toString()
            var cru5 = cru5.text.toString()
            var po1 = point1.text.toString()
            var po2 = point2.text.toString()
            var po3 = point3.text.toString()
            var po4 = point4.text.toString()
            var po5 = point5.text.toString()
            var total1 = 0.00
            var total2 = 0.00
            var total3 = 0.00
            var total4 = 0.00
            var total5 = 0.00
            var total = 0.000
            var totalcru =0.00
            if(sub1 == "" || sub2 == "" || sub3 == "" || sub4 == "" || sub5 == "" ||
                cru1 == "" || cru2 == "" || cru3 == "" || cru4 == "" || cru5 == "" ||
                po1 == "" || po2 == "" || po3 == "" || po4 == "" || po5 == ""  ){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ข้อมูลให้ครบ", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total1=cru1.toDouble()*po1.toDouble()
                total2=cru2.toDouble()*po2.toDouble()
                total3=cru3.toDouble()*po3.toDouble()
                total4=cru4.toDouble()*po4.toDouble()
                total5=cru5.toDouble()*po5.toDouble()
                totalcru =cru1.toDouble()+cru2.toDouble()+cru3.toDouble()+cru4.toDouble()+cru5.toDouble()
                total = (total1+total2+total3+total4+total5)/totalcru
                total0.setText(totalcru.toString())
                gpa.setText(total.toString())
            }
        }
        btnclear.setOnClickListener(){
            total0.setText("")
            gpa.setText("")
            sub1.setText("")
            sub2.setText("")
            sub3.setText("")
            sub4.setText("")
            sub5.setText("")
            cru1.setText("")
            cru2.setText("")
            cru3.setText("")
            cru4.setText("")
            cru5.setText("")
            point1.setText("")
            point2.setText("")
            point3.setText("")
            point4.setText("")
            point5.setText("")
        }
    }
}