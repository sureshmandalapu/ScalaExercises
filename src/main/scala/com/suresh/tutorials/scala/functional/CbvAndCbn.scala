package com.suresh.tutorials.scala.functional

import java.util.logging.Logger

object CbvAndCbn extends App {

  //Parameter evaluation strategies in Scala
  //1. call-by-value which is default - the function parameters are evaluated first
  // and then function is called
  //2. call-by-name - parameters are evaluated only when they are used and each time


  def getTime() = {
    println("inside getTime")

    System.nanoTime()
  }

  def cov(x: Long) = {
    println("inside call-by-Value")
    println(s"value of x is $x")
    println(s"value of x is $x")
  }


  def con(x: => Long) = {
    println("inside of call-by-Name")
    println(s"value of x is $x")
    println(s"value of x is $x")
    x
  }

  cov(getTime) //getTime value is computed first and then the cov function is called with result

  println("done calling cov")

  con(getTime) //getTime value is computed lazily and only when the param is actually used and each time they are accessed/used


  println("done calling con")


  def add(a: Long, b: => Long) = {
    a
  }

  val result = add(2 + 9 * 55 + 66, {
    println("b is call-by-name")
    10
  }
  )

  println(result)

  //benefits of call-by-name

  val isInfoEnabled = false

  def logInfo(x: => String) = {
    if(isInfoEnabled) {
      println(s"logging $x at INFO level")
    }
  }

  val name = "suresh"
  val age = 30
  logInfo(s"'user is $name and age is $age'")

  //when do we use this call-by-name
  //use it if you want to evaluate lazily and you want an up-to-date value of the param
  //each time you access


}
