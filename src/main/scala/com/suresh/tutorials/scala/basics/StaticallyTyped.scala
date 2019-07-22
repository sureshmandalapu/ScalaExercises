package com.suresh.tutorials.scala.basics

object StaticallyTyped extends App {

  //Scala is statically typed - its compiler can infer data types

  val aFlag = true

  println("aFlag is value is " + aFlag)

  println("aFlag type is " + aFlag.getClass)

  println("aFlag isInstance check " + aFlag.isInstanceOf[Boolean])

  val aInt = 100

  println("aInt is value is " + aInt)

  println("aInt type is " + aInt.getClass)

  println("aInt isInstance check " + aInt.isInstanceOf[Int])

  val aFloat = 10.6

  println("aFloat is value is " + aFloat)

  println("aFloat type is " + aFloat.getClass)

  println("aFloat isInstance check " + aFloat.isInstanceOf[Double])


  val aString = "suresh"

  println("aString is value is " + aString)

  println("aString type is " + aString.getClass)

  println("aString isInstance check " + aString.isInstanceOf[String])

  //Things to remember:
  //1) by default scala treats integer as Int -  to make long prefix with l or L
  //2) by default scala treats floating points as Double -  to make "Float" prefix with f or F


  def add(x: Int, y: Int) = {
    x + y
  }

}
