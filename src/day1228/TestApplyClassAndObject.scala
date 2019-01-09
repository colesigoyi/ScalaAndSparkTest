package day1228

class TestApplyClassAndObject {

}
class ApplyTest{
  def apply() = println("apply method in class is called!")
  def greetingOfClass: Unit = {
    println("Greeting method in class is called.")
  }
}
object ApplyTest{
  def apply() ={
    println("apply method in object is called")
    new ApplyTest
  }
}
object TestApplyClassAndObject{
  def main(args: Array[String]): Unit = {
    val a = ApplyTest() //这里会调用伴生对象中的apply方法
    a.greetingOfClass
    a() //这里会掉用伴生类重的apply方法
  }
}