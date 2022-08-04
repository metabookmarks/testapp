val scala3Version = "3.1.3"

githubOwner := "metabookmarks"
resolvers += Resolver.githubPackages("metabookmarks")

lazy val root = project
  .in(file("."))
  .settings(
    name := "testapp",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "testlib" %% "testlib" % "0.1.0-SNAPSHOT",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
