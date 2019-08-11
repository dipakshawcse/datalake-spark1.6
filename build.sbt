
name := "ReadCSVFileInSpark"

version := "0.1"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "1.6.0",
  "org.apache.spark" % "spark-sql_2.10" % "1.6.0"
)