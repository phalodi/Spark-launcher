package launcher_app

import org.apache.spark.launcher.SparkLauncher

object Launcher extends App {

  val spark = new SparkLauncher()
    .setSparkHome("/home/knoldus/spark-1.4.0-bin-hadoop2.6")
    .setAppResource("/home/knoldus/spark_launcher-assembly-1.0.jar")
    .setMainClass("SparkApp")
    .setMaster("local[*]")
    .launch();
  spark.waitFor();

}