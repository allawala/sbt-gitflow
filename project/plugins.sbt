addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.19.0")

// This project is its own plugin :)
unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "scala"

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
