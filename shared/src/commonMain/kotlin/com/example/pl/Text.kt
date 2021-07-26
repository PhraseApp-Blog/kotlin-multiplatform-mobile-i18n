package com.example.pl

import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc
import org.example.library.MR

class Text {

    fun getGreeting(): StringDesc {
        return StringDesc.Resource(MR.strings.greeting)
    }
}