# git-flow

git-flow for sbt-release

## NOTE

Originally cloned from https://github.com/killbirds/sbt-gitflow so as to update sbt/scala versions and host on s3

## Usage

This plugin requires sbt 1.3.8+ and sbt-release https://github.com/killbirds/sbt-gitflow+

Add 
```
resolvers += "Git Flow Releases" at "https://s3-ap-southeast-2.amazonaws.com/maven.allawala.com/sbt-gitflow/releases"

addSbtPlugin("allawala" % "sbt-gitflow" % "0.1")

```
// build.sbt
import ReleaseTransformations._
import allawala.sbt.sbtrelease.gitflow.Steps._

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  checkGitFlowExists,                       //git-flow
  inquireVersions,
  runClean,
  runTest,
  gitFlowReleaseStart,                      //git-flow
  setReleaseVersion,
  commitReleaseVersion,
  gitFlowReleaseFinish,                     //git-flow
  pushMaster,                               //git-flow
  setNextVersion,
  commitNextVersion,
  pushChanges
)
```

Run `sbt "release with-defaults"`


### Reference

https://github.com/ServiceRocket/sbt-git-flow

