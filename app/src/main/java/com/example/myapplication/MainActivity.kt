package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btConfirm)
        val edtxt1: EditText = findViewById(R.id.Pnum)
        val edtxt2: EditText = findViewById(R.id.Nnum)
        val resultTV: TextView = findViewById(R.id.textTotal)
        var flag : String = "5 Star Hotel      Price 115$"
        val spinnerVal : Spinner = findViewById(R.id.spSelect)
        var options = arrayOf("5 Star Hotel      Price 115$","4 Star Hotel      Price 70$","3 Star Hotel      Price 30$")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        button.setOnClickListener{ view ->
            //code here
            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt();
            var b: Int = 115;
            var c: Int = 70;
            var f: Int = 30;
            var res: Int = multiply(x,y);
            if(flag =="5 Star Hotel      Price 115$") {
                resultTV.text = multiply(res,b).toString();
            }
            else if (flag =="4 Star Hotel      Price 70$") {
                resultTV.text = multiply(res,c).toString();
            }
            else {
                resultTV.text = multiply(res,f).toString();
            }
        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}
public fun multiply(a: Int, b: Int): Int {
    return a*b
}

