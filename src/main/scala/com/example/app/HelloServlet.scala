package com.example.app

import org.scalatra._


class HelloServlet extends ScalatraServlet {

    get("/") {
        "Index"
    }

    get("/hello") {
        "Hello world."
    }

    get("/:name") {
        val name = params.getOrElse("name", "world")
        "Hello " + name
    }

    get("/:fname/:lname") {
        val fname = params.getOrElse("fname", "firstname")
        val lname = params.getOrElse("lname", "lastname")
        "Hello " + fname + ", " + lname
    }

}
