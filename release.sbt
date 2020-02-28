import sbtrelease._
import allawala.sbt.sbtrelease.gitflow.Steps._
import sbtrelease.ReleaseStateTransformations._

releaseProcess := Seq(
  releaseStepCommand(ExtraReleaseCommands.initialVcsChecksCommand),
  checkSnapshotDependencies,
  checkGitFlowExists,
  inquireVersions,
  runClean,
  runTest,
  gitFlowReleaseStart,
  setReleaseVersion,
  commitReleaseVersion,
  publishArtifacts,
  gitFlowReleaseFinish,
  pushMaster,
  setNextVersion,
  commitNextVersion,
  pushChanges
)
