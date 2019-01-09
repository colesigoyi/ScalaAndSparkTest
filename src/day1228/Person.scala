package day1228

class Person {
  private val id = Person.newPersonId() //调用了伴生对象中的方法，相当于java的static
  private var name = ""
  def this(name: String){
    this()
    this.name = name
  }
  def info(): Unit ={
    printf("The id of %s is:%d.\n",name,id)
  }
}
object Person { //内部相当于java的static
  private var lastId = 0; //一个人的身份编号
  def newPersonId() = {
    lastId += 1
    lastId
  }
  def main(args: Array[String]): Unit = {
    val person1 = new Person("zhangsan")
    val person2 = new Person("zhaosi")
    person1.info()
    person2.info()
  }
}
