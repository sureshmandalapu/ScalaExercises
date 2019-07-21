package com.suresh.tutorials.scala.basics

object VarAndVal extends App {

  //Vars - mutable

  var age: Int = 30

  println("age is " + age)
  age = age + 10

  println("age is " + age)

  //age = true

  //Vals - immutable

  val newAge: Int = 30
  println("newAge is " + newAge)

  //we always prefer val instead of var - to promote immutability


}
