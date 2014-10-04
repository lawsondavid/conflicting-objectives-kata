package com.home.conflicting.optimized

import com.home.common.Profiler
import org.scalatest.{Matchers, FlatSpec}

import scala.io.Source

/**
 * Home - Created by dave on 04/10/14.
 */
class WordBlenderTest extends FlatSpec with Matchers with Profiler {

  "WordBlend" should "prints all words blends in dictionary" in {
    val wordBlender = new WordBlender
    val words = Source.fromFile("/usr/share/dict/words").getLines().toList

    executeWithTiming {
      wordBlender.printWordBlends(words)
    }
  }
}
