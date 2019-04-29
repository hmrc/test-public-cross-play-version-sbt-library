import PlayCrossCompilation._

val libName = "platops-example-play-cross-compiled-library"

lazy val simpleReactiveMongo = Project(libName, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    majorVersion        := 0,
    scalaVersion        := "2.11.12",
    libraryDependencies ++= LibraryDependencies.compile ++ LibraryDependencies.test,
    resolvers           += Resolver.typesafeRepo("releases"),
    crossScalaVersions  := Seq("2.11.12"),
    playCrossCompilationSettings
  )
