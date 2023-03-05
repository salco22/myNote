package com.digitalmodularbanking.mynote.feature.presentation.notes

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController

@Composable
fun NotesScreen(
    navController: NavController,
    viewModel: NotesViewModel
){
    val state = viewModel.state
    val scope = rememberCoroutineScope()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {

            }) {

            }
        }
    ) {

    }
}