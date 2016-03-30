object Main extends App {
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  val a = readLine().toInt
  val b = readLine().toInt

  println(gcd(a, b))
}
