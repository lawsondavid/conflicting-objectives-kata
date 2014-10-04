package com.home.conflicting.readable

/**
 * Home - Created by dave on 04/10/14.
 */
class WordBlender {

  def printWordBlends(words: List[String]) = {
    words.filter(_.size == 6)
      .sorted
      .foreach(printSixLetterWordBlends(_, words))
  }

  private def printSixLetterWordBlends(wordToBlend: String, words: List[String]) {
    (1 to 5).foreach { index =>
      val splitWord = splitWordInTwo(wordToBlend, index, 6)
      if (words.contains(splitWord._1) && words.contains(splitWord._2))
        println(s"${splitWord._1} + ${splitWord._2} => $wordToBlend")
    }
  }

  def splitWordInTwo(word: String, index: Int, size: Int) = (word.substring(0, index), word.substring(index, size))
}

