object ByNameParameters {

  def byNameExample(num: => Int): Int = {
    num + num + num
  }

  def byValueExample(num: Int): Int = {
    num + num + num
  }

  // TODO
  // Stworzyć funkcję o nazwie “byNameExercise”
  // zwracającą czas w jakim została obliczona wartość przekazana jako parametr by-name.
  // Przykład wywołania funkcji znajduje się w pliku “ByNameParametersTest”.
  // Do pobrania aktualnego czasu można wykorzystać funkcję “System.nanoTime()”


}
