package day1229

trait CarId {
  var id: Int
  def currentId(): Int
}
trait CarName {
  var name: String
}
trait CarGreeting {
  def greeting(msg: String) {println(msg)}
}
trait getCarId extends CarId {
  def getId(): Int = {10000}
  println(getId)
}
class BYDCarId extends CarId with CarName with CarGreeting with getCarId {
  override var id: Int = 10000
  override var name: String = "BYD"
  def currentId(): Int = {id += 1; id}
}

class BMWCarId extends CarId with CarName with CarGreeting {
  override var id: Int = 20000
  override var name: String = "BMW"

  def currentId(): Int = {id += 1; id}
}
object MyCar {
  def main(args: Array[String]): Unit = {
    val myCarId1 = new BYDCarId
    val myCarId2 = new BMWCarId
    myCarId1.getId
    myCarId1.greeting("Welcom to my first car!")
    printf("My first car id is:%d. name is %s.\n",myCarId1.currentId(),myCarId1.name)
    myCarId2.greeting("Welcom to my second car!")
    printf("My second car id is:%d. name is %s.\n",myCarId2.currentId(),myCarId1.name)

  }
}
