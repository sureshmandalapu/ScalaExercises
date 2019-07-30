package com.suresh.tutorials.scala.basics

object StmtsAndExpressions extends App {

  //Statements - are commands do not return a value
  //Java println()
  //System.out.println("test")
  //int x = 2 is a statement in Java

  //Expressions --> are commands that return a value

    //2 + 3

  val x = println("test")

  println(s"value of x is $x")

  //Unit is valid data type in Scala and its only instance is ()

  val y = 2 + 3 //this is an expression in Scala

  println({val y = 2  + 3})

  //Arithmetic expressions
  // +, -, %, /, ...so on

  //Conditional expressions
  // ==, != > , < , >= , <= ... on on

  //if expressions

  val age = 20

  val result = if( age >= 18) {
    "you are an adult"
  } else {
    "you are not an adult"
  }

  println(s"result is $result")

  val someNumber = 30

  val result2 = if(someNumber % 2 == 0 && someNumber % 3 == 0){
    "number is divisible by both 2 and 3"
  } else if( someNumber % 2 == 0) {
    "number is divisible by 2"
  } else if(someNumber % 3 == 0) {
    "number is divisible by 3"
  } else {
    "number is not divisible by either 2 or 3"
  }
  
  println(s"result2 is: $result2")

  val flag = false

  println(if(flag) 5 else 3)

  //1 . whats the difference between "test" and println("test") == ()
  //2. whats the difference between Unit  and () and when do we use Unit

  //when we do not have a meaningful value to return in Scala, we do return Unit type in those cases

}
