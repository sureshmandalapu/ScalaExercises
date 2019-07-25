package com.suresh.tutorials.scala.futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FuturesIntroduction extends App {

  case class Friend(name: String)
  case class Tweet(message: String)


  //How do we run all these tasks parallelly at the same time to improve performance
  //A Future is a placeholder object for a value that may not yet exist.
  def getFriends(): Future[List[Friend]] =  Future {
    println("start retrieving all friends")
    Thread.sleep(1000)
    println("finished retrieving all friends")
    List(Friend("suresh"))
  }

  def getTweets(): Future[List[Tweet]] = Future {
    println("start retrieving all tweets")
    Thread.sleep(1000)
    println("finished retrieving all tweets")
    List(Tweet("I am learning Scala"))
  }

  println("started")

  val friends = getFriends()

  //callback

  friends.onComplete {
    case Success(value) => println(s"friends future completed with value : $value")
    case Failure(exception) =>  println(s"friends future failed with $exception")
  }

  val tweets = getTweets()

  tweets.onComplete {
    case Success(value) => println(s"tweets future completed with value : $value")
    case Failure(exception) =>  println(s"tweets future failed with $exception")
  }


  friends.map { friendsList =>
    println(s"friendsList is $friendsList")

  }


  println("finished")

  Thread.sleep(10000)

}
