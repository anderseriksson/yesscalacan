package com.jayway.example
 
import org.scalatest.Suite
 
class CalcExampleTest extends Suite {
 
    def testAddition() {
        assert(4 === CalcExample.add(2,2))
    }
}
