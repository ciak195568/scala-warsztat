import org.scalatest.FunSuite

class StreamsTest extends FunSuite {

  test("testStreamsExample") {
    val result = Streams.streamsExample().mkString(",")
    assert(result == "2,2,1,4,7")
  }

  test("testStreamsExercise") {
    val result = Streams.streamsExercise().mkString(",")
    assert(result == "54,60,66")
  }

}
