package com.webonise.test.kotlindemo.kotlinfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.webonise.test.kotlindemo.R
import kotlinx.android.synthetic.main.fragment_contactdetails.*

class ContactDetailsFragment: Fragment()
    {
        companion object {
        fun newInstance(name:String,address:String): ContactDetailsFragment {
            val args = Bundle()
            args.putString("name", name)
            args.putString("address", address)
            val fragment = ContactDetailsFragment()
            fragment.arguments = args
            return fragment
        }




    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var args=arguments
        nameEditText.setText(args.getString("name"));
        addressEditText.setText(args.getString("address"))



    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_contactdetails, container, false)
    }
}