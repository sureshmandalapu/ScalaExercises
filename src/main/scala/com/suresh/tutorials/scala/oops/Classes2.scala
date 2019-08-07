package com.suresh.tutorials.scala.oops

object Classes2 extends App {


  val person = new Person()

  println(person.getName())
  println(person.firstName)
  println(person.secondName)

//  // 'name' is a var
//  class Person1(var name: String) {}
//  val p1 = new Person1("Suresh Mandal")
//  println(p1.name)  // String = Suresh Mandal
//  p1.name = "suresh updated"  // String = suresh updated
//
//  // 'name' is a val
//  class Person2(val name: String)
//  val p2 = new Person2("Suresh Mandal")
//  println(p2.name)  // String = Suresh Mandal
//  p2.name = "suresh updated"  // String = Suresh Mandal
//
//
//  // 'name' is neither var or val
//  class Person3(name: String)
//  val p3 = new Person3("Suresh Mandal")
//  p3.name  // error: value name is not a member of Person
//
//  // 'name' is 'private var'
//  class Person4(private var name: String) { def printName {println(name)}  }
//
//  val p4 = new Person4("Suresh Mandal")
//  p4.name       // error: variable name in class Person cannot be accessed in Person
//  p4.printName  // Suresh Mandal


  //Constructor params can have default  values

}


//Constructors are used to initializing the object’s state.
// Like methods, a constructor also contains a collection of statements(i.e. instructions)
// that are executed at the time of Object creation.
//Scala supports two types of constructors:
//1. Primary Constructor
//2. Auxiliary Constructor
class Person(val firstName: String = "Suresh", val secondName: String = "Daniel") {

  println("the constructor begins")
  //state
  val age = 10
  //behaviour

  {
    println("I am inside of code block")
  }

  def getName() = firstName + " " + secondName

  println(s"calling getName : ${getName()}")

  override def toString: String = s"I am $firstName $secondName, my age is $age"
}
