package day1227

object IteratorTest {
  def main(args: Array[String]): Unit = {
    val iter = Iterator("Hadoop","Spark","Scala")
    while(iter.hasNext) {
      println(iter.next())
    }
    val iter2 = Iterator("Hadoop","Spark","Scala")
    for(elem <- iter2) {
      println(elem)
    }
    val xs = List(1,2,3,4,5,6,7,8,9)
    val git_grouped = xs.grouped(3)
    while (git_grouped.hasNext) {
      println(git_grouped.next())
    }
    val git_sliding = xs.sliding(3)
    while (git_sliding.hasNext) {
      println(git_sliding.next())
    }
  }
}
