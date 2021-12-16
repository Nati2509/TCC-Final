package com.example.referencial

import com.google.firebase.database.Exclude

data class Nota(
    var name:String? = null,

    @get:Exclude
    @set:Exclude

    var key:String? = null

)