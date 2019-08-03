package com.suresh.tutorials.scala.functional

object DefaultAndNamedParams extends App {

  //Default params

  def add(x: Int = 10, y: Int = 20): Int = x + y

  println(add(10, 10))

  println(add(10))

  println(add())

  def add3(x: Int, z: Int, y: Int = 5) =  x + y + z

  println(add3(1, 2, 3))

  println(add3(1, 2))

  //Named params

  def namedAdd(x: Int, y: Int) =  x + y

  println(namedAdd(1, 2))

  println(namedAdd(y = 2, x = 1))

  println(namedAdd(x = 1, 2))

  println(namedAdd(1, y = 2))

  def namedAdd3(x: Int, y: Int = 5, z: Int) =  x + y + z

  println(namedAdd3(1, z = 2))

}
