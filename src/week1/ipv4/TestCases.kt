package week1.ipv4

import utils.TestCaseVariables
import utils.test

fun main(){
    ipTestCases()
}

fun ipTestCases(){
    // Automating The Tests for the Ipv4 Checker
    TestCaseVariables.ipv4TestCases.forEach { testCase ->
        test(
           name = testCase.name,
            result = ipv4Checker( testCase.ipv4),
            correctResult = testCase.result
        )
    }
}