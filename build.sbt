scalaVersion := "2.11.0-85d15c9-SNAPSHOT"

scalacOptions in ThisBuild ++= Seq("-source:2.10","-Ystop-after:typer")

autoScalaLibrary := false

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.3"
