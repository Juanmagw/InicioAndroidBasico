package com.jgomwal111.notes.data

class Tables {
    abstract class Users{
        companion object{
            val _ID="Id"
            val TABLE_NAME="User"
            val COLUMN_NAME="Name"
            val notes: MutableList<String> = ArrayList<String>()
        }
    }

}