package com.instagram.models

class UserModel {
    var userId: String? = null
    var username: String
    var password: String
    var email: String? = null
    var profilePicture = 0

    constructor(userId: String?, username: String, password: String, profilePicture: Int) {
        this.userId = userId
        this.username = username
        this.password = password
        this.profilePicture = profilePicture
    }

    constructor(email: String?, username: String, password: String) {
        this.email = email
        this.username = username
        this.password = password
    }

    constructor(username: String, password: String) {
        this.username = username
        this.password = password
    }
}