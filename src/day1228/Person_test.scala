package day1228

object Person_test {
  def main(args: Array[String]): Unit = {
    printf("第一个人的ID是:%d.\n",Person_test.newPersonId())
    printf("第二个人的ID是:%d.\n",Person_test.newPersonId())
    printf("第三个人的ID是:%d.\n",Person_test.newPersonId())
  }
  private var lastId = 0; //一个人的身份编号
  def newPersonId() = {
    lastId += 1
    lastId
  }
}
