package org.aeb.uk

/**
 * @author ${user.name}
 */
object Main {

  def main(args : Array[String]) {
    println( "Hello World!" )

    if ( Utilities.isPalidrome( args(0) ) )
      println( s"First argument (${args(0)}) is a palindrome" )
  }

}
