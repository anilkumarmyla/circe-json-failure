import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8" % Test
  lazy val jsonUnit = "net.javacrumbs.json-unit" % "json-unit" % "2.13.0" % Test

  // Circe
  lazy val circeLiteral = "io.circe" %% "circe-literal" % "0.13.0"
  lazy val circeParser = "io.circe" %% "circe-parser" % "0.13.0"

  // Jackson
  lazy val jacksonDatabind = "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.2"

  lazy val jsonOrg = "org.json" % "json" % "20090211"

  lazy val gson = "com.google.code.gson" % "gson" % "2.8.6"

  lazy val johnzon = "org.apache.johnzon" % "johnzon-mapper" % "1.2.3"
}
