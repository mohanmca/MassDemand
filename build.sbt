/*
* set JAVA_OPTS=-Dhttp.proxySet=true -Dhttp.proxyHost=proxy.com -Dhttp.proxyPort=8080
*/
organization := "nikias"
 
name := "MassDemand"
 
version := "1.0-SNAPSHOT"
 
scalaVersion := "2.11.6"
 
libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.3.1",
  "org.scalatra" %% "scalatra-scalate" % "2.3.1",
  "org.scalatra" %% "scalatra-specs2" % "2.3.1" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "org.scalacheck" % "scalacheck_2.11" % "1.12.2" 
)
 
resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
 
libraryDependencies += "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.1.0"
 
libraryDependencies ++= Seq(
    "io.reactivex" %% "rxscala" % "0.23.0" withSources(),
    "io.reactivex" % "rxswing" % "0.21.0" withSources(), // for Swing Scheduler in suggestions
    "org.json4s" %% "json4s-native" % "3.2.11",
    "org.scala-lang.modules" %% "scala-swing" % "1.0.1",
    "net.databinder.dispatch" %% "dispatch-core" % "0.11.0",
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.slf4j" % "slf4j-api" % "1.7.5",
    "org.slf4j" % "slf4j-simple" % "1.7.5",
    "com.squareup.retrofit" % "retrofit" % "1.0.0",
    "org.scala-lang.modules" %% "scala-async" % "0.9.2"    
 )
 
 libraryDependencies += "io.lamma" % "lamma_2.11" % "2.2.2" withSources()
 