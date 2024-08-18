package com.example.crud_room_compose_kotlin.states

import com.example.crud_room_compose_kotlin.models.Usuarios

data class UsuariosState(
    val listaUsuarios: List<Usuarios> = emptyList()
)
