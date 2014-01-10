scalaVersion := "2.11.0-f24e9bc-SNAPSHOT"

scalacOptions in ThisBuild ++= Seq("-Xsource:2.10","-Ystop-after:typer")

autoScalaLibrary := false

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.3"
