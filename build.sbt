name := """sbt-gitflow"""
organization := "allawala"

scalaVersion := "2.12.10"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

sbtPlugin := true

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")

// publish info
publishMavenStyle := true
publishTo := {
  if (version.value.endsWith("SNAPSHOT")) {
    Some("Git Flow Snapshots" at "s3://s3-ap-southeast-2.amazonaws.com/maven.allawala.com/sbt-gitflow/snapshots")
  } else {
    Some("Git Flow Snapshots" at "s3://s3-ap-southeast-2.amazonaws.com/maven.allawala.com/sbt-gitflow/releases")
  }
}

initialCommands in console := """import allawala.sbt.sbtrelease.gitflow._"""

