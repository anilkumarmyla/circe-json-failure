import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "circe-json-failure",
    libraryDependencies ++= Seq(
      scalaTest,
      jsonUnit,
      circeLiteral,
      circeParser
    ),
    libraryDependencies += jacksonDatabind, // Comment this and uncomment any of below to see the test failing
    //libraryDependencies += jsonOrg,
    //libraryDependencies += gson,
    //libraryDependencies += johnzon,
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
