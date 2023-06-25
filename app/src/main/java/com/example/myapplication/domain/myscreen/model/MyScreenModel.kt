package com.example.myapplication.domain.myscreen.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MyScreenModel(
    val type: ScreenType,
    val header: Header
) : Parcelable