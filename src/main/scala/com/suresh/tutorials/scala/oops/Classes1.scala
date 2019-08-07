package com.suresh.tutorials.scala.oops

object Classes1 extends App {

  val employee1 = new Employee()
  val employee2 = new Employee()
  val employee3 = new Employee()
  val employee4 = new Employee()

  println(employee1.getAge())

  println(employee1.age)
  println(employee1.name)




}


// Classes in Scala are blueprints for creating instances/objects.
// They can contain values, variables, methods, types, objects, traits, and classes which are collectively called members.

class Employee {
  //state
     val age = 10
    val name = "Suresh"

  //behaviour

    def getAge(): Int = age

  def getName(): String = name

  class SomeOtherClass {
    //state and behaviour
    getAge()
  }

  object SomeOtherObject {
    //state and behaviour
  }

  trait SomeTrait {
    //state and behaviour
  }

}