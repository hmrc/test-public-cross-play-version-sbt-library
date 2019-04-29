import sbt._

object LibraryDependencies {

  private val play25Version = "2.5.12"
  private val play26Version = "2.6.20"

  val compile: Seq[ModuleID] = PlayCrossCompilation.dependencies(
    shared = Seq(),
    play25 = Seq(
      "com.typesafe.play" %% "play" % play25Version
    ),
    play26 = Seq(
      "com.typesafe.play" %% "play" % play26Version
    )
  )

  val test: Seq[ModuleID] = PlayCrossCompilation.dependencies(
    shared = Seq(
      "org.scalatest"          %% "scalatest"          % "3.0.5"       % Test,
      "org.pegdown"            % "pegdown"             % "1.6.0"       % Test
    ),
    play25 = Seq(
      "ch.qos.logback"         % "logback-classic"     % "1.1.2"       % Test,
      "com.typesafe.play"      %% "play-test"          % play25Version % Test,
      "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.1"       % Test
    ),
    play26 = Seq(
      "ch.qos.logback"         % "logback-classic"     % "1.2.3"       % Test,
      "com.typesafe.play"      %% "play-test"          % play26Version % Test,
      "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2"       % Test
    )
  )

}
