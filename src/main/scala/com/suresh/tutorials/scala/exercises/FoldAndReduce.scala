package com.suresh.tutorials.scala.exercises

object FoldAndReduce extends App {

  val list = List(1, 2, 3, 4, 5)

  //Imperative style - DO NOT DO THIS SCALA

  var sum = 0

  for (ele <- list) {
    sum = sum + ele
  }

  println("sum using imperative style is " + sum)

  //functional oriented way - always prefer this
  //foldLeft

  def add(x: Int, y: Int) = {
    val accSum = x + y
    println(s"got $x and $y, sum is $accSum")
    accSum
  }

  val sum1 = list.foldLeft(0)(add)
  val sum2 = list.foldRight(0)(add)

  println("sum using foldLeft is " + sum1)
  println("sum using foldRight is " + sum2)

  //fold
  val sum3 = list.fold(0)(add)

  println("sum using fold is " + sum3)


  //Strings
  val strings = List("suresh", "abc", "x", "")

  //find sum of lengths of all these strings from the List

  def accLen(x: Int, y: String) = x + y.length

  val sumOfLengths = strings.foldLeft(0)(accLen)
  println("sumOfLengths using foldLeft is " + sumOfLengths)

  //use fold to concatenate all strings in the collection
  val conCanString = strings.fold("")((x: String, y: String) => x + y)
  println("conCanString using fold is " + conCanString)


  //reduce
  val reducedSum = list.reduceLeft(add)
  val reducedSum1 = list.reduceRight(add)
  val reducedSum2 = list.reduce(add)

  println("reducedSum using reduceLeft is " + reducedSum)
  println("reducedSum using reduceRight is " + reducedSum1)
  println("reducedSum using reduce is " + reducedSum2)

  val emptyList = List.empty[Int]

  val emptySumFold = emptyList.fold(0)(add)

  println("emptySumFold is " + emptySumFold)

  val emptySumReduce = emptyList.reduce(add)

  println("emptySumReduce is " + emptySumReduce)

  //1.Difference between foldLeft/foldRight and fold
  //2.Difference between fold and reduce operations

}
