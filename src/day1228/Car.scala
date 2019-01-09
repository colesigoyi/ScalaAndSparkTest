package day1228

abstract class Car {  //是抽象类，不能直接被实例化
  var carBrand: String  //字段没有初始化值，就是一个抽象字段
  def info()  //抽象方法，不需要使用abstract关键字
  def greeting() {println("Welcome to my car!")}  //具体方法
}
class BMWCar extends Car {
  override var carBrand: String = "BMW"
  def info() {printf("This is a %s car. It is expensive.\n",carBrand)}
  override def greeting(): Unit = {println("Welcome to my BMW!")}
}
class BYDCar extends Car {
  override var carBrand: String = "BYD"
  def info() {printf("This is a %s car. It is cheap.\n",carBrand)}
  override def greeting(): Unit = {println("Welcome to my BYD!")}
}
object MyCar{
  def main(args: Array[String]): Unit = {
    val car1 = new BMWCar()
    val car2 = new BYDCar()
    car1.greeting()
    car1.info()
    car2.greeting()
    car2.info()
  }
}
