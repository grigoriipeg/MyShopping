package com.peg.myshopping.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.peg.myshopping.entities.LibraryItem
import com.peg.myshopping.entities.NoteItem
import com.peg.myshopping.entities.ShoppingListItem
import com.peg.myshopping.entities.ShoppingListName

@Database(
    entities = [
        LibraryItem::class,
        NoteItem::class,
        ShoppingListItem::class,
        ShoppingListName::class
    ],
    version = 1
)

abstract class MainDataBase: RoomDatabase() {

    abstract fun getDao(): Dao

    companion object{
        @Volatile
        private  var INSTANCE: MainDataBase? = null

        fun getDataBase(context: Context): MainDataBase{
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "shopping_list.db"
                ).build()
                instance
            }
        }
    }
}