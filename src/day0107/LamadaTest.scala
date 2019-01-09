package day0107

class LamadaTest {
  //(num: Int) => num * 2 //ni匿名函数
  //val myNumFunc: Int => Int = (num: Int) => num * 2
  val myNumFunc = (num: Int) => num * 2
  val number = 5 //省略Int类型声明，scals具有类型推断机制，可以自动腿短类型变量
  val addMore = (x: Int)=> x>0  //普通函数
  var more = 1
  val addMore_1 = (x: Int) => x + more  //闭包函数，闭包反映了一个从开放到封闭的过程

  val numList = List(-3,-5,1,6,-8,0,10)
  val num1 = numList.filter(x => x>0)
  val num2 = numList.filter(_ > 0)  //_为占位符。为了让函数更加简洁，只要每个参数在函数字面量内仅仅出现一次

  def reduceNum: Unit ={
    val addNum = numList.reduceLeft(_ + _)  //reduce归约操作
    println(addNum)
    val foldNum = numList.fold(10)(_+_) //fold操作需要从一个初始的种子值开始
    println(foldNum)
  }
  def forElem: Unit ={  //for循环进行遍历
    for(elem <- numList)
      print(elem + " ")
  }
  def foreachElem: Unit ={  //foreach循环遍历
    numList.foreach(elem => print(elem + " "))
  }
  var books = List("Hadoop", "Hive", "Spark")

  def mapTest: Unit ={
    books = books.map(s => s.toUpperCase())
    println(books)
    val list = books flatMap (s => s.toList)
    println(list)
    list.foreach(elem => print(elem + " "))

  }

}
object Test extends LamadaTest {
  def main(args: Array[String]): Unit = {
    println(myNumFunc(3))
    println(addMore_1(10))
    more = 9
    println(addMore_1(10))
    println(num1)
    println(num2)
    forElem
    println()
    foreachElem
    println()
    mapTest
    println()
    reduceNum
  }
}
