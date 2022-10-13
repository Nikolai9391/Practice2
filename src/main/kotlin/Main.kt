import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
          //1 задача
      val myAge: Int = 17
      val isTeenager:Boolean = 13 <= myAge && myAge <= 19
      println(isTeenager)
          //2 задача
      val theirAge:Int = 30
      val bothTeenagers:Boolean = 13 <= myAge && myAge <= 19 && 13 <= theirAge && theirAge <= 19
      println(bothTeenagers)
          //3 задача
      val reader:String = "Nikolai"
      val author:String = "Richard Lucas"
      val authorIsReader = reader == author
      println(authorIsReader)
        //4 задача
      val readerBeforeAuthor = author > reader
      println(readerBeforeAuthor)
          //5 задача
      if (isTeenager)
      {
          println("Подросток")
      }
      else
          println("Не подросток")
          //6 задача
      val answer = if (isTeenager)
       println ("Подросток")
      else
       println("Не подросток")
          //7 задача
      var counter:Int = 0
      while (counter < 10)
      {
      var x:Int = counter
      counter++
      println(x)
      }
          //8 задача
      var roll:Int = 0
      do {
          roll = Random().nextInt(6)
          counter++
          println("После $counter бросков, roll равен $roll")
      } while (counter < 0)
          //9 задача
      val range = Random().nextInt(10)
      val count = 10
      var Sum:Int = 0
      for (range in range..count) {
          println("range =$range")
          Sum = range*range
          println(Sum)
      }
          //10 задача
      var sum2:Double = 0.0
      for (range in range..count) {
          println("range =$range")
          sum2 = sqrt(range.toDouble())
          println(sum2)
      }
          //11 задача
      var sum: Int = 0
      for (row in 1 until 8 step 2) {
          for (column in 0 until 8) {
              sum += row * column
          }
      }
          println(sum)
}
