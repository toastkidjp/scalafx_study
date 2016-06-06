name := "effective_scala_slide"

version := "0.0.1"

scalaVersion := "2.11.8"

organization := "toastkid"

fork in run := true

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.92-R10"

