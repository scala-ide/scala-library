scalaVersion := "2.11.0-61739ac-SNAPSHOT"

scalacOptions in ThisBuild ++= Seq("-Yisnt-scala-211","-Ystop-after:typer")

autoScalaLibrary := false

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.3"
