package com.tos.wordmaster.predioticlocation

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.widget.Toast

class ExampleService:Service() {
    val service:ServiceImp= ServiceImp()
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        var intent:Intent= Intent(this,MainActivity::class.java)
//        var paddindIntent:PendingIntent= PendingIntent.getActivities(this,0, arrayOf(intent),0)
//        var notification:Notification=NotificationCompat.Builder(this, CHANNEL_ID)
//            .setContentTitle("Example Service")
//            .setContentText("Service Running")
//            .setSmallIcon(R.drawable.ic_android_black_24dp)
//            .setContentIntent(paddindIntent)
//            .build()
//        startForeground(11,notification)
//        return START_NOT_STICKY
//    }
    override fun onBind(intent: Intent?): IBinder? {
        return service
    }

    fun getLocation(){
        Toast.makeText(this,"Location",Toast.LENGTH_SHORT).show()
    }

    inner class  ServiceImp : Binder() {
         fun getServiceObj():ExampleService{
            return this@ExampleService
        }
    }
}