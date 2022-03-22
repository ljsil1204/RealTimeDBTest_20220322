package com.leejinsil.realtimedbtest_20220322

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

abstract class BaseActivity : AppCompatActivity() {

    lateinit var mContext : Context

//    DB 서버 주소
    val realtimeDB = FirebaseDatabase.getInstance("https://realtimedbtest20220322-default-rtdb.asia-southeast1.firebasedatabase.app/")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mContext = this
    }

    abstract fun setupEvents()
    abstract fun setValues()
}