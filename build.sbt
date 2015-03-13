organization := "com.example"

name := "hello-scalatra"

version := "0.0.1"

scalaVersion := "2.11.6"

tomcat()

libraryDependencies ++= Seq(
    "org.scalatra" %% "scalatra" % "2.3.0",
    "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)
