package com.webonise.test.kotlindemo.kotlinfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.webonise.test.kotlindemo.R
import com.webonise.test.kotlindemo.UserDetailActivity

import com.webonise.test.kotlindemo.adapter.UserListAdapter
import com.webonise.test.kotlindemo.model.UserListData
import kotlinx.android.synthetic.main.fragment_user_list.*

class UserListFragment:Fragment(){
    val arrayList = ArrayList<UserListData>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_user_list, container, false)    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addDataToModel()
        recylerUserList.layoutManager = LinearLayoutManager(activity)

        // Access the RecyclerView Adapter and load the data into it
        recylerUserList.adapter = UserListAdapter(arrayList, activity,{ partItem : UserListData -> partItemClicked(partItem) })
    }

    /**
     * func to set the data in data class and add the data in array list
     */

    fun addDataToModel(){

        var useraListData=UserListData("Aniket","Pimple saudager","29")
        useraListData= UserListData("Ankur","katraj","24")
        useraListData= UserListData("amit","pimpri","28")
        for(i in 1..10){
            useraListData=UserListData("amit","pimpri","28")
            arrayList.add(useraListData)
            Log.e("data",""+useraListData.toString())


        }

        Log.e("data",""+arrayList.size)


    }


    private fun partItemClicked(partItem : UserListData) {

        (activity as UserDetailActivity).loadDetailsFragment(partItem.studentName,partItem.studentAddressa)
    }


}