package com.suresh.tutorials.scala.basics

object DataTypes {

  def main(args: Array[String]): Unit = {

    //booleans

    var isEligible: Boolean = true //false

    println(isEligible)

    //Byte [-128, 127]

    var aByte: Byte = 100
    println(aByte)

    //Char [0, 65535]

    var aChar: Char = 55555

    println("aChar value is " + aChar)

    //Short [-32768, 32767]

    var aShort: Short = 32760
    println("aShort value is " + aShort)

    //Int

    var anInt: Int = 1000000
    println("anInt value is " + anInt)

    //Long

    var aLong: Long = 1000000000
    println("aLong value is " + aLong)

    //Float

    //Scala, by default, treats floating point values as Double,
    // we we need 'f' to make value as float

    var aFloat: Float = 10.5F
    println("aFloat value is " + aFloat)

    //Double
    var aDouble: Double = 109898.5878
    println("aDouble value is " + aDouble)

    //String

    var aString: String = "    "
    println("aString is " + aString)

    //Unit
    var aUnit: Unit = println("my unit")
    println("aUnit is " + aUnit)

  }
}
