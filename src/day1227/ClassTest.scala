package day1227

import javax.jws.WebParam.Mode

class ClassTest {
  private var value = 0
  private var name = "" //表示计数器的名称
  private var mode = 1 //mode用来表示计数器类型（比如，1表示步数计数器，2表示时间计数器）
  def this(name: String){
    this()  //构造主函数
    this.name = name
  }
  def this(name: String, mode: Int){
    this(name)  //调用前一个辅助构造器
    this.mode = mode
  }
  /*def value = privateValue
  def value_=(newValue: Int): Unit ={
    if(newValue > 0) privateValue = newValue
  }*/
  def increment(step: Int) : Unit = { value += step}
  //def increment() : Unit =  value += 1
  //def increment1() {value += 1}
  def current() : Int = {value} //把value作为方法的返回值
  def info(): Unit = {printf("Name:%s and mode is %d\n",name,mode)}
}
object MyCounter {  //单利对象，整个程序的入口
  def main(args: Array[String]){

    val myCounter1 = new ClassTest
    val myCounter2 = new ClassTest("Runner")
    val myCounter3 = new ClassTest("Timer", 2)
    //println(myCounter1.value)
    //myCounter1.value = 3
    //println(myCounter1.info())
    //myCounter1.increment(1) //或者写成myCounter.increment
    //println(myCounter1.current())//或者写成println(myCounter.current）
    myCounter1.info() //显示计数器信息
    myCounter1.increment(1) //设置步长
    printf("Current value is: %d\n",myCounter1.current()) //显示计数器当前值
    myCounter2.info() //显示计数器信息
    myCounter2.increment(2) //设置步长
    printf("Current value is: %d\n",myCounter2.current()) //显示计数器当前值
    myCounter3.info() //显示计数器信息
    myCounter3.increment(3) //设置步长
    printf("Current value is: %d\n",myCounter3.current()) //显示计数器当前值
  }
}
