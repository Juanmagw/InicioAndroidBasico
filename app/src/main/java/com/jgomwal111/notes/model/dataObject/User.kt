package com.jgomwal111.notes.model.dataObject

class User {

    private var name:String = ""
    private var id:Int = 0

    constructor(name: String) {
        this.name = name
    }

    fun getName():String{
        return name
    }

    fun getId():Int{
        return id
    }
}