package com.suresh.tutorials.scala.oops

import scala.collection.mutable.ListBuffer

object ShoppingCartExample extends App {

  //TODO: USE CASE CLASSES
  class Item(val productId: Int, val unitPrice: Double) {

    def canEqual(other: Any): Boolean = other.isInstanceOf[Item]

    override def equals(other: Any): Boolean = other match {
      case that: Item =>
        (that canEqual this) &&
          productId == that.productId &&
          unitPrice == that.unitPrice
      case _ => false
    }

    override def hashCode(): Int = {
      val state = Seq(productId, unitPrice)
      state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
    }
  }

  class ShoppingCart() {
    private val items = ListBuffer.empty[Item]

    //add

    def add(item: Item) = {
      items.addOne(item)
    }

    //delete
    def delete(item: Item) = {
      items -= item //items = items - item
    }

    //total
    def getTotal(): Double = {
      items.foldLeft(0.0)((accSum, item ) => accSum + item.unitPrice)
    }
  }

  val cart  = new ShoppingCart()

  cart.add(new Item(1, 1.0))
  cart.add(new Item(2, 2.0))
  cart.add(new Item(3, 3.0))
  cart.add(new Item(4, 4.0))

  println(s"Total is ${cart.getTotal()}")

  cart.delete(new Item(4, 4.0))


  println(s"Total is ${cart.getTotal()}")

}

