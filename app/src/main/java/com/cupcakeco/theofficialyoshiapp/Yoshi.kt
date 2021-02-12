package com.cupcakeco.theofficialyoshiapp

import androidx.annotation.ColorInt
import java.util.*

class Yoshi(
    // Name, colour, size, adoption date, picture, favourite cookie, extra notes
    private var name: String = "Unnamed Yoshi",                  // name
    @ColorInt private var color: Int = 0xff6fd251.toInt(),       // color in hex ARGB
    private var height: Float = 10F,                             // height in cm
    private var adoptionDate: Calendar = Calendar.getInstance(), // adoption date
    private var imgid: Int = R.drawable.appicon,                 // image ID
    private var favCookie: String = "Chocolate chip",            // favourite cookie
    private var extra: String = ""                               // extra info
) {/*...*/}