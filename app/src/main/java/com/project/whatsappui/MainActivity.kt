@file:OptIn(ExperimentalPagerApi::class)

package com.project.whatsappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import com.google.accompanist.pager.ExperimentalPagerApi
import com.project.whatsappui.screens.homescreen.ContactsHomeScreen

@OptIn(ExperimentalAnimationApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactsHomeScreen()
        }
    }
}