package com.webonise.test.kotlindemo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import com.webonise.test.kotlindemo.kotlinfragment.ContactDetailsFragment
import com.webonise.test.kotlindemo.kotlinfragment.UserListFragment

class UserDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)
        /**
         * initialize a fragment in kotlin android
         */
        val  fragment=UserListFragment()
        supportFragmentManager.inTransaction {
            replace(R.id.containerUserList, fragment).addToBackStack("")
        }
    }


    /**
     * inline functions are the function which accepts function as a input and returns function
     */
    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
        val fragmentTransaction = beginTransaction()
        fragmentTransaction.func()
        fragmentTransaction.commit()
    }

    fun loadDetailsFragment(name:String,address:String){

        val  fragment=ContactDetailsFragment.newInstance(name,address)
        supportFragmentManager.inTransaction {
            replace(R.id.containerUserList, fragment).addToBackStack("")
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        fragmentManager.popBackStack()
    }

}