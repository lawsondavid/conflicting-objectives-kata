package com.home.common

/**
 * Home - Created by dave on 04/10/14.
 */
trait Profiler {
  def executeWithTiming[R](block: => R): R = {
    val startTime = System.currentTimeMillis()
    val result = block
    val endTime = System.currentTimeMillis()
    println(s"\n-----------\nTIME TAKEN: ${endTime - startTime}ms\n-----------\n")
    result
  }
}
