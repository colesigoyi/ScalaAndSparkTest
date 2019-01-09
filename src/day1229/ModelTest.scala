package day1229

object ModelTest {
  def main(args: Array[String]): Unit = {
    caseTest1
    caseTest2
    caseTest3
    casetest4
  }
  //一个简单的整型值的匹配
  def caseTest1: Unit = {
    val colorNum = 1
    val colorStr = colorNum match {
      case 1 => "red"
      case 2 => "green"
      case 3 => "yellow"
      case _ => "No Allowed"
    }
    println(colorStr)
  }
  //在模式匹配的case语句中可以使用变量
  def caseTest2: Unit = {
    val colorNum = 4
    val colorStr = colorNum match {
      case 1 => "red"
      case 2 => "green"
      case 3 => "yellow"
      case unexpected => "Num:" + unexpected + " is Not Allowed"
    }
    println(colorStr)
  }
  //Scala可以对表达式的类型进行匹配
  def caseTest3: Unit = {
    for(elem <- List(9,12.1,"Spark","Hadoop",'Hello)){
      val str = elem match {
        case i: Int => i + " is an int value"
        case d: Double => d + " is a double value"
        case "Spark" => "Spark is found"
        case s: String => s + " is a string value"
        case unexcepted => unexcepted + " is an unexcepcted value"
      }
      println(str)
    }
  }
  //守卫（guard）语句，可以在模式匹配中添加一些必要的处理逻辑
  def casetest4: Unit = {
    for(elem <- List(1,2,3,4)){
      elem match {
        case _ if (elem %2 == 0) => println(elem + " is even.")
        case _ => println(elem + " is odd.")
      }
    }
  }
}
