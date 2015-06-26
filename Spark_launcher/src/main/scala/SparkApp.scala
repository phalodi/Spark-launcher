

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SparkApp extends App{
  val conf=new SparkConf().setMaster("local[*]").setAppName("spark-app")
  val sc=new SparkContext(conf)
  val rdd=sc.parallelize(Array(2,3,2,1))
  rdd.saveAsTextFile("result")
  sc.stop()
}