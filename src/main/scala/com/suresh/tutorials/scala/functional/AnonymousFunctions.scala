package com.suresh.tutorials.scala.functional

object AnonymousFunctions extends App {
  //Anonymous functions are also called functions literals

  def inc2(x: Int) : Int = x + 2 // this is just a ordinary function has got a name 'inc2'

  inc2(10) // result will be 12
  //light weight syntax


  (x: Int) => x + 2 // this is a function literal or anonymous function

  val inc2Literal: Int => Int =  (x: Int) => x + 2   //Int => Int




  println(inc2Literal(10))


  def mul(x: Int, y: Int) =  x * y // this is just a ordinary function has got a name 'mul'

  (x: Int, y: Int) => x * y // this is a function literal or anonymous function

  val mulLiteral: (Int, Int) => Int =  (x: Int, y: Int) => x * y //(Int, Int) => Int


  println(mulLiteral(10, 10))



  def dir() = {
    System.getProperty("user.dir")
  }

  val getDir: () => String = () => System.getProperty("user.dir")



  println(getDir())


  //Int => Int              this syntax is a short hand for Function1[Int, Int]
  //(Int, Int) => String    this syntax is a short hand for Function2[Int, Int, String]
 // () => String            this syntax is a short hand for  Function0[String]


  //Advantages of Anonymous functions (or function literals)
  //return all even integers in a List of integers
   val aList = List.range(1, 101)

    println(aList)

 // val isEven = (x:Int) => x % 2 == 0

  val evens = aList.filter(_ % 2 == 0) //(x:Int) => x % 2 == 0

  println(evens)

  val doubles = aList.map(_ * 2) // (x: Int) =>  x * 2

  println(doubles)

  println(aList)


  val strings  = List("suresh", "david", "daniel", "harold")

  println(strings.filter(_.length == 6))

  strings.foreach(println)


}
