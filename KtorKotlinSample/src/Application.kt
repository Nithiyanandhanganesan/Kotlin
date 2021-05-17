package com.example

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

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)



@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    routing {

        this.rootGetSample()
        //curl -X POST -d "some data" localhost:8080/
        this.rootPost()

        this.rootGet()

    }
}

