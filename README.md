This is a simple project for testing compilation of the 2.10 library source using a(n instrumented) 2.11 compiler.

It depends on a specific hashed version for the used 2.11 scala-compiler, generated at compile time of said compiler with ant distpack-maven-opt -Dmaven.version.suffix=XXXX. see the first line of build.sbt.
