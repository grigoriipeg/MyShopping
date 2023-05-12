package com.peg.myshopping.activities

import android.app.Application
import com.peg.myshopping.db.MainDataBase

class MainApp: Application() {
    val database by lazy { MainDataBase.getDataBase(this) }
}