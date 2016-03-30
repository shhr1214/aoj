object Main extends App {
  def isPrime(num: Int): Boolean = {
    if (num == 1) return false
    for (i <- 1 to num) {
      if ((i != 1) && (i != num) && (num % i == 0)) {
        return false
      }
    }
    return true
  }

  var result = 0
  val N = readInt()
  for (i <- 0 to N-1) {
    val num = readInt()
    if (isPrime(num)) result = result + 1
  }
  println(result)
}
