package com.example.app

import org.scalatra._


class HelloServlet extends ScalatraServlet {

    get("/") {
        "Hello world"
    }

    get("/:name") {
        val name = params.getOrElse("name", "world")
        "Hello " + name
    }
}
