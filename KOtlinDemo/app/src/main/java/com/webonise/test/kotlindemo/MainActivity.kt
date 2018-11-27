package com.webonise.test.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {


    /**
     * click function method uses when operator in java switch is used
     */
    override fun onClick(v: View) {
        when(v.id){
           R.id.saveBtn-> Toast.makeText(this,nameEditText.text.toString(),Toast.LENGTH_LONG).show()
           R.id.checkBtn->
               if(!TextUtils.isEmpty(nameEditText.text)){
                   second()
               }

        }
    }

    /**
     * function using intent because directly we cant use another function
     */
    fun second(){
        val intent = Intent(this, UserDetailActivity::class.java)
        startActivity(intent)
    }

    /**
     * we can directly use the view by id instead of declaring view and using it
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saveBtn.setOnClickListener(this)
        checkBtn.setOnClickListener(this)



    }



}
