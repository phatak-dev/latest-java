ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

scalacOptions += "-target:jvm-1.17"

lazy val root = (project in file("."))
  .settings(
    name := "JavaExperiments"
  )
