import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.edureka",
      scalaVersion := "2.11.8",
      version      := "1.0-SNAPSHOT"
    )),
    name := "SparkDemo-Batch291018",
    libraryDependencies += scalaTest % Test
  )
