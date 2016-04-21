name := "example-spark"

version := "1.0"

scalaVersion := "2.11.8"

val SPARK_VERSION = "1.6.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % SPARK_VERSION
)