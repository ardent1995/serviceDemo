package com.example.tousif.servicedemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    companion object {
        private val TAG = MyService::class.java.simpleName
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"onCreate on ${Thread.currentThread().name}")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG,"onStartCommand on ${Thread.currentThread().name}")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder? {
        Log.d(TAG,"onBind on ${Thread.currentThread().name}")
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy on ${Thread.currentThread().name}")
    }
}
