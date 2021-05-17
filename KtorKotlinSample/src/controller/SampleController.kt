package com.example.controller

import io.ktor.routing.Routing
import com.example.controller.rootGet
import com.example.controller.rootGetSample
import com.example.controller.rootPost
import io.ktor.application.*
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.http.*
import io.ktor.request.receive
import io.ktor.response.*
import io.ktor.routing.*

private val userData = "{\"users\":[\"anand\",\"nithiy\"]}"

fun Routing.rootGetSample() {
    get("/"){
        call.respondText("Hello Ktor application")
    }
}

fun Routing.rootPost() {
    post("/"){
        var post = call.receive<String>()
        call.respondText("response from $post body", ContentType.Text.Plain)
    }

}

fun Routing.rootGet(){
    get("/users"){
        call.respondText(userData)
    }
}