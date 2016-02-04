
organization := "com.flipkart.marketing"

name := "fk-pf-connekt"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.0",
  "com.typesafe.akka" % "akka-stream-experimental_2.11" % "2.0-M1",
  "com.typesafe.akka" % "akka-http-core-experimental_2.11" % "2.0-M1" withSources(),
  "com.typesafe.akka" % "akka-http-experimental_2.11" % "2.0-M1" withSources(),
  /*
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.0-M1",
  */
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.6.3",
  "com.typesafe.akka" % "akka-http-testkit-experimental_2.11" % "2.0-M2",
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.0",
  "com.typesafe.akka" % "akka-stream-experimental_2.11" % "2.0-M1",
  "com.typesafe.akka" % "akka-http-core-experimental_2.11" % "2.0-M1",
  "com.typesafe.akka" % "akka-http-experimental_2.11" % "2.0-M1"
)
