package com.czm.numberbutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout

/**
 * Create by chenzhimin
 * on 2019/6/10
 */
class NumberButton(context: Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {
    var inputStr: EditText

    init {
        val inflateView = LayoutInflater.from(context).inflate(R.layout.view_number_button, this)
        val btnAdd = inflateView.findViewById<View>(R.id.btn_add)
        inputStr = inflateView.findViewById(R.id.et_number)
        val btnReduce = inflateView.findViewById<View>(R.id.btn_reduce)
        btnAdd.setOnClickListener {
            inputStr.setText(inputStr.text.toString().toInt().plus(1).toString())
            inputStr.setSelection(inputStr.text.length)
        }
        btnReduce.setOnClickListener {
            inputStr.setText(inputStr.text.toString().toInt().minus(1).toString())
            inputStr.setSelection(inputStr.text.length)
        }
    }

    fun getText(): String {
        return inputStr.text.toString()
    }


}