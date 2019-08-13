package com.suresh.tutorials.scala.functional

object Currying extends App {

  //Currying is a means of transforming a function that takes more than one argument
  // into a chain of calls to functions, each of which takes a single argument.

  //  def add(x: Int, y: Int) =  x + y
  //
  //  add(2, 3)

  //  def add(x: Int)(y: Int) = x + y
  //
  //  val add2  = add(2) _  //add2 is a partially applied function
  //
  //  val result = add2(3)
  //
  //  println(result)

  //def add(x: Int, y: Int, z: Int)  = x + y = z
  def add(x: Int)(y: Int)(z: Int) = x + y + z

  def addX = add(2) _ //addX is a partially applied function

  def addY = addX(3) //addY is a partially applied function

  val result = addY(4)

  println(result)

  //def someFun(x: Int, y: String)(z: Double) =  ???

  //.curried function in Scala

  def add3(x: Int, y: Int, z: Int) = x + y + z

  val curriedAdd = (add3 _).curried

  println(curriedAdd(2)(3)(4))

  val curriedAddX = curriedAdd(2)

  val curriedAddY = curriedAddX(3)

  val curriedAddZ = curriedAddY(4)

  println(curriedAddZ)

  def computeTotal(vat: Double, serviceCharge: Double, productPrice: Double): Double =
    productPrice + productPrice * serviceCharge / 100 + productPrice * vat / 100

  def computeTotalCurried(vat: Double)
                         (serviceCharge: Double)
                         (productPrice: Double): Double =
    productPrice + productPrice * serviceCharge / 100 + productPrice * vat / 100

  val vatApplied = computeTotalCurried(20) _ //eta-expansion

  val serviceChargeApplied = vatApplied(10)

  val finalProductPrice = serviceChargeApplied(120)

  println(finalProductPrice)

  //no need to define a new computeTotalCurried version
  //instead use .curried

  val curriedVersion = (computeTotal _).curried
  val vatAppliedV2 = curriedVersion(20)
  val serviceChargeAppliedV2 = vatApplied(10)

  val finalProductPriceV2 = serviceChargeAppliedV2(120)
  println(finalProductPriceV2)

}
