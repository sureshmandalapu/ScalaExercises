package com.suresh.tutorials.scala.functional

import scala.util.Random

object PureFunctions extends App {
  //A Pure function is a function which is
  //1. Has no side-effects
  //2. Given the same inputs, always returns the same output (Idempotent)

  //PF = ODI + NSE (PF - Pure Function, ODI - Output Depends on only Inputs, NSE - No Side Effects)

  //Side Effects - changing something somewhere
  //Examples are as follow:
  //1. Modifying any external variable or object property
  //2. Logging to the console
  //3 .Writing to the screen
  //4. Writing to a file
  //5. Writing to the network
  //6. Triggering any external process
  //7. Calling any other functions with side-effects
  //8... etc//Benefits of Pure functions in Functional Programming
  //  //Pure functions offer Referential Transparency - which means that function calls are replaced
  //  //by the result values

  var temp = 1

  //this is NOT  a pure function because of side effect 1 above
  def fun1(x: Int): Int = {
    temp = temp + x
    x + 1
  }

  //this is NOT  a pure function because of side effect 1 above
  def fun2(x: Int, y: Int): Int = {
    println(s"values of (x, y) are ($x, $y)")
    x + y
  }


  //this is NOT  a pure function because it returns different results for each invocation
  def getTime(): Long = System.nanoTime()

  println(getTime())
  println(getTime())
  println(getTime())

  //this is NOT  a pure function because of side effect 7 above
  def fun3(x: Int) = {
    getTime()
    x *x
  }


  //Pure functions

  //pure function
  def fun4(x: Int, y: Int)  = x + y  //x * y
  //fun4(3, 5) //8

  //pure functions
  Math.max(2, 3) //3

  //This is NOT a pure functions
  Random.nextInt()
  println(Random.nextInt())
  println(Random.nextInt())

  //All string operations are pure functions


  //Benefits of Pure functions in Functional Programming
  //Pure functions offer Referential Transparency - which means that function calls are replaced
  //by the result values

  val result = fun4(2, 3)
  //
  fun4(2, 3) //this call can be replaced by result
    //
fun4(2, 3) //this call can be replaced by result

}
