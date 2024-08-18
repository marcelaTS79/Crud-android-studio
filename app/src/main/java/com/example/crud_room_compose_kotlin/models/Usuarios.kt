package com.example.crud_room_compose_kotlin.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class Usuarios(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo("nombres")
    val nombres: String,
    @ColumnInfo("apellidos")
    val apellidos: String,
    @ColumnInfo("documento")
    val documento: String,
    @ColumnInfo("correo")
    val correo: String,
    @ColumnInfo("telefono")
    val telefono: String
)
