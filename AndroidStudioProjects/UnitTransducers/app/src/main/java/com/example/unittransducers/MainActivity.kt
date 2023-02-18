package com.example.unittransducers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import com.example.unittransducers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var inputNumber: Int = 0
    var cmToM : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view) //constraintLayout 로드

        //xml에서 선언했던 각 변수명을 binding을 통해 가져옴
        val outputTextView = binding.outputTextView
        val outputUnitTextView = binding.outputUnitTextView
        val inputEditText = binding.inputEditText
        val inputUnitTextView = binding.inputUnitTextView
        val swapImageButton = binding.swapImageButton



        //addTextChangedListener : 문자열이 변경되면 알려주는 메소드
        inputEditText.addTextChangedListener { text ->
            inputNumber = if(text.isNullOrEmpty()) 0 //text를 계속 지워서 아무것도 없어도 0을 반환함
            else text.toString().toInt() //text는 type이 nullable하므로 문자로 바꾼 다음 숫자로 바꿔줌

            if(cmToM)
            {
                outputTextView.text = inputNumber.times(0.01).toString()
            }
            else
            {
                outputTextView.text = inputNumber.times(100).toString()
            }
        }

        swapImageButton.setOnClickListener {
            cmToM = cmToM.not()
            if(cmToM == true) {
                inputUnitTextView.text = "cm"
                outputUnitTextView.text = "m"
                outputTextView.text = inputNumber.times(0.01).toString()
            }
            else
            {
                inputUnitTextView.text = "m"
                outputUnitTextView.text = "cm"
                outputTextView.text = inputNumber.times(100).toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean("cmToM",cmToM)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        cmToM = savedInstanceState.getBoolean("cmToM")
        binding.inputUnitTextView.text = if(cmToM == true) "cm" else "m"
        binding.outputUnitTextView.text = if(cmToM == true) "m" else "cm"

        super.onRestoreInstanceState(savedInstanceState)
    }

}
