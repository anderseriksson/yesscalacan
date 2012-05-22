/**
 * Extra material showing REPLs ability to execute a shell command and work with the result
 */

object ReplDemo {

  // http://stackoverflow.com/questions/1948044/printing-unicode-from-scala-interpreter
  // export JAVA_OPTS="-Dfile.encoding=UTF-8"


// COMBINATION DEMO OF REPL AND OF POWERFUL COLLECTIONS AND OF HIGHER ORDER FUNCTIONS

//  684  :sh find .. -name *.scala
//  687  res2.lines
//  688  res2.lines.head
//  689  res2.lines.head.split('/')
//  690  res2.lines.head.split('/').end
//  691  res2.lines.head.split('/').head
//  692  res2.lines.head.split('/').tail
//  693  res2.lines.head.split('/').length
//  694  res2.lines.head.split('/').toList
//  697  res2.lines.map( line => line.split('/').toList.last )

//  747  res2.lines.map( line => line.split('/').toList.last ).groupBy( x => x ).values
//  748  res2.lines.map( line => line.split('/').toList.last ).groupBy( x => x ).values.size
//  749  res2.lines.map( line => line.split('/').toList.last ).groupBy( x => x ).values.map(x => x.size)
//  750  res2.lines.map( line => line.split('/').toList.last ).groupBy( x => x ).values.map(x => x.size).max


}
