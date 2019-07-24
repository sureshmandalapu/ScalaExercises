package com.suresh.tutorials.scala.basics

object Laziness extends  App {

  //early or eager or strict evaluation (which is default in scala)

  val x = {
    //("I am inside of x code block")
    //some costly computation  like calling database or calling a remote service
    2 + 3 * 1000 /45
  }

  //println(s"x is $x")

  //the issue is when we really don't make use of the result of expensive operation

  //Lazy - declare the variables/values as lazy
  //

  lazy val y = {
    //println("I am inside of y code block")
    //some costly computation  like calling database or calling a remote service
    2 + 3 * 1000 /45
  }

  //println(s"y is $y")

   lazy val a = {
    println("I am inside of A code block")
    //some costly computation  like calling database or calling a remote service
    2 + 3 * 1000 /45
  }

  lazy val b = {
    println("I am inside of B code block")
    //some costly computation  like calling database or calling a remote service
    2 + 4 * 1000 /45
  }

  def testLazy(flag: Boolean) = {
    if(flag){
      println(s"a value is $a")
    }else{
      println(s"b value is $b")
    }
  }

  testLazy(true)


  //List vs Stream
  //Lists are strict but Streams are lazy
//  val list = (1 to 100000000).toList
//  println(s"list is $list")

  val stream = (1 to 100000000).toStream
  println(s"stream is $stream")

  //stream.foreach(println(_))

  //What is the difference between a Stream and a View and an Iterator
  //https://docs.scala-lang.org/tutorials/FAQ/stream-view-iterator.html
}
