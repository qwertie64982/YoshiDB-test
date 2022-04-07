package com.cupcakeco.theofficialyoshiapp.models

import androidx.annotation.ColorInt
import com.cupcakeco.theofficialyoshiapp.R
import java.util.*

class Yoshi(
    // Name, colour, size, adoption date, picture, favourite cookie, extra notes
    var name: String = "Unnamed Yoshi",                  // name
    @ColorInt var color: Int = 0xff6fd251.toInt(),       // color in hex ARGB
    var height: Float = 10F,                             // height in cm
    var adoptionDate: Calendar = Calendar.getInstance(), // adoption date
    var imgid: Int = R.drawable.appicon,                 // image ID
    var favCookie: String = "Chocolate chip",            // favourite cookie
    var extra: String = ""                               // extra info
) {/*...*/}