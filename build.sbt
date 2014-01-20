resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

scalaVersion := "2.11.0-SNAPSHOT"

scalacOptions in ThisBuild ++= Seq("-Xsource:2.10","-Ystop-after:typer")

autoScalaLibrary := false

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.4-RC1"

