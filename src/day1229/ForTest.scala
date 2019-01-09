package day1229

object ForTest {
  def main(args: Array[String]): Unit = {
    val university = Map("HDU" -> "hangzhou Dianzi University",
      "THU" -> "Tsinghua University")
    for((k,v) <- university) printf("Code is : %s and name is %s.\n",k,v)
  }
}
