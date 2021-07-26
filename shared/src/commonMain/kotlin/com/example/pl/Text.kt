package com.example.pl

import dev.icerock.moko.resources.desc.PluralFormatted
import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.ResourceFormatted
import dev.icerock.moko.resources.desc.StringDesc
import org.example.library.MR

class Text {

    fun getGreeting(): StringDesc {
        return StringDesc.Resource(MR.strings.greeting)
    }

    fun getGreetingWithName(name:String): StringDesc {
        return StringDesc.ResourceFormatted(
            MR.strings.greeting_with_name, name)
    }

    fun getSelectQuantity(): StringDesc {
        return StringDesc.Resource(
            MR.strings.select_quantity)
    }

    fun getMyPluralFormattedDesc(quantity: Int): StringDesc {
        // we pass quantity as selector for correct plural string and for pass quantity as argument for formatting
        return StringDesc.PluralFormatted(MR.plurals.shirt, quantity, quantity)
    }
}