package com.home.conflicting.readable

import com.home.common.Profiler
import org.scalatest.{Matchers, FlatSpec}

import scala.io.Source

/**
 * Home - Created by dave on 04/10/14.
 */
class WordBlenderTest extends FlatSpec with Matchers with Profiler {
  private val words = List("al", "bums", "albums",
    "bar", "ely", "barely",
    "be", "foul", "befoul",
    "con", "vex", "convex",
    "here", "by", "hereby",
    "jig", " saw", "jigsaw",
    "tail", " or", "tailor")

  "WordBlend" should "prints all words blends in dictionary" in {
    val wordBlender = new WordBlender
    wordBlender.printWordBlends(Source.fromFile("/usr/share/dict/words").getLines().toList)
  }
}
