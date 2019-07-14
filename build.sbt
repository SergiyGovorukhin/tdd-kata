import sbt.Keys.libraryDependencies

name := "tdd-kata"

version := "0.1"

lazy val commonSettings = Seq(
  organization := "ghost",
  scalaVersion := "2.13.0",
  libraryDependencies ++= Seq(
    "org.scalactic" %% "scalactic" % "3.0.8" % "test",
    "org.scalatest" %% "scalatest" % "3.0.8" % "test"
  )
)

lazy val tddKata =
  project.in( file(".") )
    .settings(commonSettings)
    .aggregate(StringCalculator, newKata)

lazy val StringCalculator = project.settings(commonSettings)

lazy val newKata = project.settings(commonSettings)

