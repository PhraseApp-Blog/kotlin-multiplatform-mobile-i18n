package com.example.pl

import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc
import org.example.library.MR

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun getMyString(): StringDesc {
        return StringDesc.Resource(MR.strings.encoding)
    }
}