package com.project.whatsappui.screens.homescreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.project.whatsappui.components.ContactItem
import com.project.whatsappui.data.ContactList.contactsList

@Composable
fun ChatTab() {

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(contactsList) { contactsList ->
            ContactItem(contactsList)
        }
    }
}
