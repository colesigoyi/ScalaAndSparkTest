package day1227
import scala.collection.mutable.Set
import scala.collection.mutable.Map
object Demo01 {
  def main(args: Array[String]): Unit = {
    val strList = List("Spark","bigDate")
    val otherList = "Apache"::strList
    val intList = 1::2::3::Nil
    println(otherList,intList)
    //mySet是可变对象，Set是不可变，但是执行mySet +=时是指向新的对象
    var mySet = Set("Hadoop","Spark")
    mySet += "Scala"
    println(mySet)
    //myMutableSet是val不可变的，当导入import scala.collection.mutable.Set
    //这个包的时候声明的Set是可变的，执行+=时是集合本身对象进行改变，指针并没有改变
    val myMutableSet = Set("A","B","C")
    myMutableSet += "D"
    println(myMutableSet)

    val university = Map(
      "HDU" -> "Hangdian",
      "THU" -> "Tsinghua",
      "PKU" -> "Peking")
    println(university("HDU"))
    val xmu = if(university.contains("XMU")) university("XMU") else 0
    println(xmu)
    val university2 = Map(
      "ABC" -> "123"
    )
    university2("aaa") = "111"
    university2 += ("BBB" -> "222")
    println(university2)
    for((k,v) <- university)
      printf("Code is : %s and name is : %s\n",k,v)
    for(k <- university.keys)
      println(k)
    for(v <- university.values)
      println(v)
  }
}
