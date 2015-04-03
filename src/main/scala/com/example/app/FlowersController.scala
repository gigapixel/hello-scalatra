package com.example.app

import org.scalatra._
import com.google.gson.Gson


class FlowersController extends ScalatraServlet {

    case class Flower(slug: String, name: String) {
        def toJson() = new Gson().toJson(this)
    }

    before() {
        contentType = "application/json"
    }

    get("/") {
        val flower: Flower = Flower("red-rose", "Red Rose")
        flower.toJson()
    }

    post("/") {
        val flower: Flower = new Gson().fromJson(request.body, classOf[Flower])
        flower.toJson()
    }
}
