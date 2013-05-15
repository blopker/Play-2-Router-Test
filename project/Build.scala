import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "routerTest"
  val appVersion      = "1.1-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    publishTo := Some(Resolver.file("Bo's Repo", Path.userHome / "code" / "blopker.github.com" / "maven-repo" asFile)),
    publishMavenStyle := true
  )

}
