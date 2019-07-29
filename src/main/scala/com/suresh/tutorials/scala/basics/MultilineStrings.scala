package com.suresh.tutorials.scala.basics

object MultilineStrings extends App {

  //multiline strings

  val aString = "kjsdkdhjs"

  val multilineString =
    """This is an example
       #of a multi line
       #String""".stripMargin('#')

  println(multilineString)

  val name = "Suresh"

  val age = 30

  val anotherMultiString =
    s"""
       |Hello, my name is $name,
       |and my age is $age,
       |See you later
    """.stripMargin

  println(anotherMultiString)


  val employeeJson =
    s"""{
      |"employee" : {
      |"name": $name,
      |"age" : $age,
      |"country": "UK"
      |}
      |}""".stripMargin

  println(employeeJson)

}
