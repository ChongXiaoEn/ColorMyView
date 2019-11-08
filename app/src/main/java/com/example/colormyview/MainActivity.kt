package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

        }
        fun setListeners(){


            val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text,
                    box_four_text, box_five_text,rootConstraintlLayout)

            for(item in clickableViews) {

            item.setOnClickListener{makeColored(it)}


        }
    }

    private fun makeColored(view: View) {
        when (view.id) {  //switch(id)in java or c

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(R.drawable.rosegoldimage)
            R.id.box_two_text -> view.setBackgroundColor(R.drawable.image1)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(R.drawable.rosegoldimage)
        }
    }
}
