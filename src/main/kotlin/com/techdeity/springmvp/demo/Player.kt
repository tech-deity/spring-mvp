package com.techdeity.springmvp.demo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table
import org.springframework.data.annotation.Id


@Entity
@Table(name = "tb_player")
data class Player(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
    val name: String,
    val age: Int,
    val nationality: String
)