package day0107
/*
读取文件夹内的文件，并输出文件内的词频
 */
import java.io.File
import scala.io.Source
object WordCount {
  def main(args: Array[String]): Unit = {
    val dirfile = new File("/Users/taoxuefeng/Documents/学习资料")
    val files = dirfile.listFiles
    for(file <- files) println(file)
    val listFiles = files.toList
    val wordMap = scala.collection.mutable.Map[String,Int]()
    listFiles.foreach(file => Source.fromFile(file).getLines().
      foreach(line=>line.split("").
        foreach(
          word=>{
            if (wordMap.contains(word)) {
              wordMap(word)+=1
            }else{
              wordMap+=(word->1)
            }
          }
        )
      )
    )
    println(wordMap)
    for((key,value)<-wordMap) println(key+ ": " +value)
  }
}
