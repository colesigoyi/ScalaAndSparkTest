package day1228

class TestApplyClass {
  def apply(param: String): String = {
    println("apply method called, parameter is:" + param)
    "Hello World!"
  }
}
