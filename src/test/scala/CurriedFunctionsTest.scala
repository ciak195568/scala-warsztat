import org.scalatest.FunSuite

class CurriedFunctionsTest extends FunSuite {

  test("testCurriedExample"){
    val functionWithA = CurriedFunctions.curriedExample(2)_
    val result = functionWithA(3)
    assert(result == 5)
  }

  test("testCurriedExercise"){
    // Przykładowy test do curriedExercise

//    val functionWithA = CurriedFunctions.curriedExercise(5)_
//    val functionWithAAndB = functionWithA(2.5)
//    val result = functionWithAAndB(5)
//    assert(result == 1.5)
  }
}
