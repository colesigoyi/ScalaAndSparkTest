package day1227

object ArrayTest {
  def main(args: Array[String]): Unit = {
    val intvalueArr = new Array[Int](3)
    intvalueArr(0) = 12
    intvalueArr(1) = 34
    intvalueArr(2) = 45
    //val intvalueArr = Array(12,34,45)
    for(i <- 0 to 2) {
      println(intvalueArr(i))
    }
    val myStrArr = new Array[String](3)
    myStrArr(0) = "Spark"
    myStrArr(1) = "Hadoop"
    myStrArr(2) = "Scala"
    //val myStrArr = Array("Spark","Hadoop","Scala")
    for(i <- 0 to 2) {
      println(myStrArr(i))
    }
  }
}
