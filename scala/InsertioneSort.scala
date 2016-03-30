object Main extends App {
  def insertionSort(A: Array[Int], N: Int): Unit = {
    println(A.mkString(" "))
    for (i <- 1 to N -1) {
      val v = A(i)
      var j = i - 1
      while (j >= 0 && A(j) > v) {
        A(j+1) = A(j)
        j = j -1
      }
      A(j+1) = v
      println(A.mkString(" "))
    }
  }
  val N: Int = readLine().toInt
  val A: Array[Int] = readLine().split(" ").map(_.toInt)

  insertionSort(A,N)
}
