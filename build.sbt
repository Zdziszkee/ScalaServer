ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaServer",
    idePackagePrefix := Some("me.zdziszkee")
  )
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.5.0-M1"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.8.0-M2"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.8.0-M2"


