package day1228
//主构造器，变成主构造器里的两个参数
class Counter(val name: String,val mode: Int) {
  private var value = 0 //value用来存储计数器的起始值
  def increment(step: Int): Unit = {value += step}
  def current(): Int = {value}
  def info(): Unit = {printf("Name is:%s\nMode is: %d\n",name,mode)}
}
object MyCounter {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter("Timer",2)
    myCounter.info()
    myCounter.increment(1)
    printf("Current Value is:%d\n",myCounter.current())
  }
}
