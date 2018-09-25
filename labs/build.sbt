name := "labs"

version := "0.1"

scalaVersion := "2.12.6"

lazy val scalaTestVersion = "3.0.4"

libraryDependencies ++= Seq(
  // test
  "org.scalatest" %% "scalatest" % scalaTestVersion % Test
)