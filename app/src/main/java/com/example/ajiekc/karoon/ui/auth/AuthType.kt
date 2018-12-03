package com.example.ajiekc.karoon.ui.auth

enum class AuthType {
    VK,
    FB,
    GOOGLE;

    companion object {
        fun fromValue(value: String?): AuthType? {
            return values().find { it.name.equals(value, true) }
        }
    }
}