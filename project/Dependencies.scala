import sbt._

object Dependencies {


  lazy val kafkaVersion = "2.8.0"

  lazy val  kafkaclient = "org.apache.kafka" % "kafka-clients" % kafkaVersion


def compileDependencies=kafkaclient
}
