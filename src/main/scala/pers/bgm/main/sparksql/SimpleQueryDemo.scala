package pers.bgm.main.sparksql

import org.apache.spark.sql.{SparkSession}
/**
  * Created by 10673 on 2017/12/5.
  */
class SimpleQueryDemo {

}
object SimpleQueryDemo{
  def main(args:Array[String]):Unit={
    val ss = SparkSession.builder().appName("Spark Demo 20171205").master("spark://master:7077") .getOrCreate()
    ss.sqlContext.sql("show databases").show()
  }
}
