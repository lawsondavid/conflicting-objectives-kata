package com.home.conflicting.optimized

import scala.collection.immutable.IndexedSeq

/**
 * Home - Created by dave on 04/10/14.
 */
class WordBlender {

  def printWordBlends(dictionaryWords: List[String]) = {
    val words = dictionaryWords.toSet
    words.filter(_.size == 6)
      .flatMap(findWordBlends(_, words))
      .toList
      .sorted
      .foreach(println)
  }

  private def findWordBlends(wordToBlend: String, words: Set[String]): IndexedSeq[String] = {
    (1 to 5).flatMap { index =>
      val blendedWords = splitWordInTwo(wordToBlend, index, 6)
      if (words.contains(blendedWords._1) && words.contains(blendedWords._2))
        Some(s"${blendedWords._1} + ${blendedWords._2} => $wordToBlend")
      else
        None
    }
  }

  def splitWordInTwo(word: String, index: Int, size: Int) = (word.substring(0, index), word.substring(index, size))
}
