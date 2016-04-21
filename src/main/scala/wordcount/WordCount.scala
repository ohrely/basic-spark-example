package wordcount

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by ohrely on 4/21/16.
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("trying").setMaster("local")
    val sc = new SparkContext(conf)
    val input = sc.textFile("src/main/resources/jabberwocky")
    val wc = input.flatMap{line => line.split(" ")}
      .map{word => (word, 1)}
      .reduceByKey(_+_)
    wc.collect().foreach(println)
  }
}
