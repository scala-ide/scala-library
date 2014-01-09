scalaVersion := "2.11.0-1a8a33e-SNAPSHOT"

scalacOptions in ThisBuild ++= Seq("-Yisnt-scala-211","-Ystop-after:typer")

autoScalaLibrary := false

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.3"
