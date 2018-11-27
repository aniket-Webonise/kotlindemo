package com.webonise.test.kotlindemo.sharedPreference

import android.content.Context

class PreferenceManager private constructor() {

    companion object {
        private lateinit var instance: PreferenceManager

        val managerInstance: PreferenceManager
            get() {
                if (instance == null) {
                    instance = PreferenceManager()
                }

                return instance
            }
    }



}