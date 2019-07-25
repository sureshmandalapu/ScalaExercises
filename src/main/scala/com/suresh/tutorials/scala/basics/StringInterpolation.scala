package com.suresh.tutorials.scala.basics

object StringInterpolation extends App {

  //1. s interpolator

  val name = "Suresh"
  val age = 10

  println("Hello " + name + " age is " + age)

  println(s"Hello $name, age is $age")

  println(s"1 + 1 is = ${1 + 1}")

  case class Student(name: String, age: Int)

  val student = Student("Suresh", 30)

  println(s"Hello ${student.name}, age is ${student.age}")

  //s interpolator processes the special characters or literals

  println(s"Hello ${student.name} \n age is ${student.age}")

  //raw

  println(raw"Hello ${student.name} \n age is ${student.age}")

  //f - printf c, c++

  val height = 6.257676f


  println(s"Hello ${student.name} \n age is ${student.age}, height is $height cm")

  println(f"Hello ${student.name} \n age is ${student.age}, height is $height%.1f cm")

}
