package com.home.conflicting.extensible

import com.home.common.Profiler
import org.scalatest.{Matchers, FlatSpec}

import scala.io.Source

/**
 * Home - Created by dave on 04/10/14.
 */
class WordBlenderTest extends FlatSpec with Matchers with Profiler {

  "WordBlender" should "blend smaller words" in {
    val words = Source.fromFile("/usr/share/dict/words").getLines().toList
    val blender = new WordBlender()
    executeWithTiming {
      blender.blendedWords(words,6)
    }
  }

}
