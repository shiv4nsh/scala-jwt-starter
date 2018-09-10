name := "scala-jwt-starter"

version := "0.1"

organization :="com.cakesolutions"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.nimbusds" % "nimbus-jose-jwt" % "6.0.2",
  "io.argonaut" %% "argonaut" % "6.2.2")
