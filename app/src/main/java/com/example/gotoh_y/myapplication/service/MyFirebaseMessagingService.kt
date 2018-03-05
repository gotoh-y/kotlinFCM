package com.example.gotoh_y.myapplication.service

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(p0: RemoteMessage?) {
        Log.d(TAG, "From: " + p0?.from)

        if (p0?.data?.isNotEmpty() == true) {
            Log.d(TAG, "Message data payload: " + p0.data)

        }

        if (p0?.notification != null) {
            val notification : RemoteMessage.Notification? = p0.notification
            val title = notification?.title
            val body = notification?.body

            Log.d(TAG,"Message title: " + title +" ,Message body: " +body)

        }
    }
}