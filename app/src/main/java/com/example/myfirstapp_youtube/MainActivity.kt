package com.example.myfirstapp_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myfirstapp_youtube.constance.Constance_salary
import com.example.myfirstapp_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {
            Log.d("not log","ID img manager = ${R.drawable.manager}")
            val resultValue = bindingClass.editValue.text.toString()
            bindingClass.tvResult.visibility = View.VISIBLE
            bindingClass.imageView.visibility = View.VISIBLE
            when(resultValue){

                Constance_salary.DIRECTOR -> {
                    val tempText = "Вам начислено ${Constance_salary.DIRECTOR_SALARY}$"
                    if(bindingClass.password.text.toString() == Constance_salary.DIRECTOR_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.manager)

                    } else {
                        bindingClass.tvResult.text = "Неправильный пароль"
                        bindingClass.imageView.setImageResource(R.drawable.stop)
                    }
                }

                Constance_salary.ENGINEER -> {
                    val tempText = "Вам начислено ${Constance_salary.ENGINEER_SALARY}$"

                    if(bindingClass.password.text.toString() == Constance_salary.ENGINEER_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.manager)
                    } else {
                        bindingClass.tvResult.text = "Неправильный пароль"
                        bindingClass.imageView.setImageResource(R.drawable.stop)
                    }
                }

                Constance_salary.APP_DEV -> {
                    val tempText = "Вам начислено ${Constance_salary.APP_DEV_SALARY}$"
                    if(bindingClass.password.text.toString() == Constance_salary.APP_DEV_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.manager)
                    } else {
                        bindingClass.tvResult.text = "Неправильный пароль"
                        bindingClass.imageView.setImageResource(R.drawable.stop)
                    }
                }
                else -> {
                    bindingClass.tvResult.text = "Указаный сотрудник у нас не числиться"
                    bindingClass.imageView.setImageResource(R.drawable.stop)
                }
            }
        }
    }
}
