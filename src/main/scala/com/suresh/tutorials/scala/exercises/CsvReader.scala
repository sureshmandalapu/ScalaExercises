package com.suresh.tutorials.scala.exercises

import scala.io.Source
import scala.util.{Failure, Success, Try}

object CsvReader extends App {

  case class  Student(name: String, age: Int)

  val data =

    Try {
      Source.fromResource("students.csv")
        .getLines()
        .toStream
        .drop(1)
        .map { line =>
          val arr = line.split(",")
          Student(arr(0).trim, arr(1).trim.toInt)
        }

    } match {
      case Success(value) => value
      case Failure(exception) =>
        //logging
        //throw new
        println(s"error during parsing csv, exception is: $exception")
        List.empty[Student]
    }

  println(data)

}
