package com.home.conflicting.extensible

/**
 * Home - Created by dave on 04/10/14.
 */
class WordBlender {

  def blendedWords(dictionaryWords: List[String], wordSize: Int) = {
    val words = dictionaryWords.toSet
    words.filter(_.size == wordSize)
      .flatMap(findWordBlends(_, words, wordSize))
      .toList
      .sorted
  }

  private def findWordBlends(wordToBlend: String, words: Set[String], wordSize: Int): IndexedSeq[String] = {
    (1 to wordSize).flatMap { index =>
      val blendedWords = splitWordInTwo(wordToBlend, index, wordSize)
      if (words.contains(blendedWords._1) && words.contains(blendedWords._2))
        Some(s"${blendedWords._1} + ${blendedWords._2} => $wordToBlend")
      else
        None
    }
  }

  def splitWordInTwo(word: String, index: Int, size: Int) = (word.substring(0, index), word.substring(index, size))
}