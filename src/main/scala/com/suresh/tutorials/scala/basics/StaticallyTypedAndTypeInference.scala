package com.suresh.tutorials.scala.basics

object StaticallyTypedAndTypeInference extends App {

  //Statically typed

  val aFlag: Boolean = true

  //aFlag = 1 //Wont compile

  val name: String = "Suresh"

  //name = true

  //Type Inference

  val anotherFlag = true

  println(anotherFlag.getClass)

  //val anInt: Int = 10

  val anInt = 10

  println(anInt.getClass)


  //function

  def add(x: Int, y: Int) = {
    x + y
  }

  //Things to remember:
  //1) by default scala treats integer as 'Int' type -  to make long prefix with l or L
  //2) by default scala treats floating points as 'Double' type -  to make "Float" prefix with f or F

  val anotherInt = 10l

  println(anotherInt.getClass)

  val aFloat = 10.5F
  println(aFloat.getClass)



}
