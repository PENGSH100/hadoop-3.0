package com.scala.pengsh.study.spark

/**
  * @Author pengsh
  * @Date: 2021/02/23
  * @Description
  */
object SparkOne {
  def main(args: Array[String]): Unit = {
    val inputFile =  "file:///usr/local/spark/mycode/wordcount/word.txt"
    val conf = new SparkConf().setAppName("WordCount")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile(inputFile)
    val wordCount = textFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b)
    wordCount.foreach(println)
  }
}
