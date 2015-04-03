organization := "com.example"

name := "hello-scalatra"

version := "0.0.1"

scalaVersion := "2.11.6"

tomcat()

libraryDependencies ++= Seq(
    "org.scalatra" %% "scalatra" % "2.3.0",
    "org.scalatra" %% "scalatra-json" % "2.3.0",
    "com.typesafe.slick" %% "slick" % "2.1.0",
    "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
    "org.slf4j" % "slf4j-nop" % "1.6.4",
    "org.json4s" %% "json4s-jackson" % "3.2.9",
    "com.google.code.gson" % "gson" % "2.3.1"
)
