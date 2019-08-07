package com.suresh.tutorials.scala.oops

object Classes3 extends App {

  val person1 = new AnotherPerson("Suresh", "Mandal") //this will invoke primary constructor
  val person2 = new AnotherPerson("Suresh") //this will invoke Auxiliary constructor 1
  val person3 = new AnotherPerson() //this will invoke Auxiliary constructor 2

  //A class can have only one primary constructor , but can have several auxiliary constructors

  //Private Constructor -  by making them as 'private'

}


class AnotherPerson (val firstName: String, val secondName: String) { //primary constructor

  //Auxiliary constructors
  def this(firstName: String) {
    this(firstName, "Mandal")
  }

  def this() {
    this("Suresh", "Mandal")
  }


  println("the constructor begins")
  //state
  val age = 10
  //behaviour

  {
    println("I am inside of code block")
  }

  def getName() = firstName + " " + secondName

  getName()
  println(s"calling getName : ${getName()}")

  override def toString: String = s"I am $firstName $secondName, my age is $age"
}
