package com.example.crud_room_compose_kotlin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import com.example.crud_room_compose_kotlin.viewmodels.UsuariosViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.crud_room_compose_kotlin.views.InicioView
import com.example.crud_room_compose_kotlin.views.AgregarView
import com.example.crud_room_compose_kotlin.views.EditarView

@Composable
fun NavManager(viewModel: UsuariosViewModel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "inicio") {
        composable("inicio") {
            InicioView(navController, viewModel)
        }

        composable("agregar") {
            AgregarView(navController, viewModel)
        }

        composable("editar/{id}/{nombres}/{apellidos}/{documento}/{correo}/{telefono}", arguments = listOf(
            navArgument("id") { type = NavType.IntType },
            navArgument("nombres") { type = NavType.StringType },
            navArgument("apellidos") { type = NavType.StringType },
            navArgument("documento") { type = NavType.StringType },
            navArgument("correo") { type = NavType.StringType },
            navArgument("telefono") { type = NavType.StringType }
        )) {
            EditarView(
                navController,
                viewModel,
                it.arguments!!.getInt("id"),
                it.arguments?.getString("nombres"),
                it.arguments?.getString("apellidos"),
                it.arguments?.getString("documento"),
                it.arguments?.getString("correo"),
                it.arguments?.getString("telefono")
            )
        }
    }

}