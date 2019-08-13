package com.suresh.tutorials.scala.functional

object MethodsVsFunctions extends App {

  //Methods
  //A Scala method, as in Java, is a part of a class/object.
  //It has a name, a signature, optionally some annotations, and some bytecode.

  def inc(x: Int) =  x + 1

  //function equivalent of the above Method
  val incFun = (x: Int) =>  x + 1

  new Function1[Int, Int] {
    override def apply(x: Int): Int = x + 1
  }


  //1. methods can't be a final value but functions can be final values

  //inc

  println(incFun)

  println(incFun.isInstanceOf[Function1[Int, Int]])

  val anotherIncFun = inc _

  println(anotherIncFun.isInstanceOf[Function1[Int, Int]])

  //eta - expansion -
  // when a function is expected but a method is provided,
  // Scala will automatically converts the method into a function.
  // This is called the ETA expansion.

  val myList = List(1, 2, 3,4 )

  println(myList.map(inc))

  //.apply() method

  println(incFun(1))

  println(incFun.apply(1))

  //methods can have no params list, but functions must have a param list

  def m1 =  10

  val m1Fun = () => 10

  //Method name means invocation while function name means the function itself

  println(m1)

  println(m1Fun)

  println(m1Fun())

  //How to force a method to become a function?


  //Why we can provide a method when a function is expected?

  //we can compose functions using andThen

  val fun1 = (x: Int) => x + 1

  val fun2 = (y: Int) =>  y * 10

  val result = fun1.andThen(fun2)(1)
  println(result)

  //Methods can have overloads, functions can't.
  //Methods need not have an argument list, functions must have one.
  //Methods can have type parameters, functions can't. (This is the big one.)
  //Methods can have implicit parameters, functions can't.
  //Methods can have sequence parameters ("varargs"), functions can't.
  //Methods can have named and default arguments, functions can't.

}
