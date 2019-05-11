import org.scalatest.FunSuite

class ByNameParametersTest extends FunSuite {

  test("testByValueExample") {

    var i = 0
    def nextNumber() = {
      i+=1
      i
    }

    val result = ByNameParameters.byNameExample(nextNumber())

    assert(result == 6)
  }

  test("testByNameExample") {

    var i = 0
    def nextNumber() = {
      i+=1
      i
    }

    val result = ByNameParameters.byValueExample(nextNumber())

    assert(result == 3)
  }

  test("testByNameExercise") {
    // Przykładowy test do byNameExercise

//    val time = ByNameParameters.byNameExercise(println("Hello World!"))
//
//    println("Execution time: " + time + " nanoseconds" )
  }

}
