package com.instagram.models

class StoryModel {
    var name: String
    var dailyPhoto: Int
    var views = 0
    private var sId: String? = null

    constructor(sId: String?, name: String, dailyPhoto: Int, views: Int) {
        this.sId = sId
        this.name = name
        this.dailyPhoto = dailyPhoto
        this.views = views
    }

    constructor(name: String, dailyPhoto: Int) {
        this.dailyPhoto = dailyPhoto
        this.name = name
    }

    fun getsId(): String? {
        return sId
    }

    fun setsId(sId: String?) {
        this.sId = sId
    }
}