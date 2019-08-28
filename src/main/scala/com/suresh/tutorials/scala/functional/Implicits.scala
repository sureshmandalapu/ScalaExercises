package com.suresh.tutorials.scala.functional

import scala.concurrent.duration.FiniteDuration
import scala.concurrent.duration._
import scala.collection.immutable.StringOps._
object Implicits extends App {


  implicit var text =  "Hi" //implicit declarations can be var, val or def or class
  //implicit var anotherPrefix =  "Hello"
  implicit val anotherPrefix =  1

  def sayHello(name: String)(implicit prefix: String) =  s"$prefix $name"

  //println(sayHello("Suresh")("Hi"))

  println(sayHello("Suresh")("Hi"))
  println(sayHello("Suresh"))


  implicit val timeout: FiniteDuration = 1.second

  def doLongRunningTaskA()(implicit timeout: FiniteDuration): String = {
    //some time consuming and long running task
    //with lots of logic inside
    "some result"
  }

  def doLongRunningTaskB()(implicit timeout: FiniteDuration): Int = {
    //some time consuming and long running task
    //with lots of logic inside
    1
  }

  def doLongRunningTaskC()(implicit timeout: FiniteDuration): Long = {
    //some time consuming and long running task
    //with lots of logic inside
    timeout.toMillis
  }

  println(doLongRunningTaskA())
  println(doLongRunningTaskB())
  println(doLongRunningTaskC())


  //Implicit conversions using 'defs'

  implicit def Int2String(number: Int): String = number.toString()

  def someRandomNumber: Int = scala.util.Random.nextInt

  val someResult: String = someRandomNumber

//  def convert(a: Int): String = {
//    ///
//    a.toString
//  }

  println(someResult)

  //Implicit classes -  to extend the behaviour of a closed classes

  val a: String = "Hello"

  //In Java we can not extend String class as its final,
  //but in Scala we can do this
  implicit class ExtendString(s: String) {
      def increment: String = s.map((c: Char) => (c +1).toChar)
  }

  println("ABC".increment)   //prints “BCD”

  //Scala is extendable

  //Interview Question: where all Scala looks for implicit definitions ?
  //https://stackoverflow.com/questions/5598085/where-does-scala-look-for-implicits
  //First look in current scope
        //Implicits defined in current scope
        //Explicit imports
        //wildcard imports
        //Same scope in other files
  //Now look at associated types in
        //Companion objects of a type
        //Implicit scope of an argument's type (2.9.1)
        //Implicit scope of type arguments (2.8.0)
        //Outer objects for nested types
        //Other dimensions

  def add(list: List[Int], sum: Int): Int = {
    list match {
      case Nil => sum
      case a :: b => add(b, a + sum )
    }
  }

 println(add(List(1, 2,3 ,4, 5), 0))
}

class Person(val firstName: String, val lastName: String)