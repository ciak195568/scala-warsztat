object Streams {

  def streamsExample(): Stream[Int] = {

    val stream1 = Stream.from(1, 3)

    val stream2 = 2 #:: 2 #:: stream1

    stream2.take(5)
  }

  def streamsExercise(): Stream[Int] = {
    // TODO
    // Stworzyć strumień zawierający 3 pierwsze liczby parzyste,
    // podzielne przez 3, większe od 50.

    Stream.empty
  }
}
