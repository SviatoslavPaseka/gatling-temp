package com.eshop.qa.utils

import java.util.concurrent.ThreadLocalRandom
import scala.util.Random

object Randomizer {
  def getInt(min: Int, max: Int): Int = {
    val random: ThreadLocalRandom = ThreadLocalRandom.current()
    val r = random.nextInt(min, max)
    return r
  }

  def getIntFromSeq(seq: Seq[Int]): Int = {
    val result = seq.apply(Random.nextInt(seq.size))
    return result
  }

  def getName(): String = {
    val names = Seq[String]("Perf", "Max", "Unit", "Test")
    return names.apply(getInt(0, names.length))
  }

  def getEmail(): String = {
    val names = Seq[String]("note@ukr.net", "min@gmail.com", "mops@load.com", "now@wold.org")
    return names.apply(getInt(0, names.length))
  }

  def getAddress(): String = {
    val names = Seq[String]("Kiev Ukraine", "Rome Italy", "Madrid Spain", "Minsk Belarus")
    return names.apply(getInt(0, names.length))
  }
}