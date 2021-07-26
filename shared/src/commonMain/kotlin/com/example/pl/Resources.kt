package com.example.pl

import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.getImageByFileName
import org.example.library.MR

class Resources {

    fun getImage(): ImageResource? {
        return MR.images.getImageByFileName("shirt")
    }
}