object NumberFormatter {

  def format(number: Int): String = {
    val reversed: String = number.toString.reverse
    val indexedSeq: Seq[(Char, Int)] = reversed.zipWithIndex
    val nestedSeq: Seq[Seq[Char]] = indexedSeq.map(
      (t) => if (t._2 >= 3 && t._2 % 3 == 0 && t._1 >= '0' && t._1 <= '9') {
        Seq(',', t._1)
      } else {
        Seq(t._1)
      })
    nestedSeq.flatten.reverse.mkString
  }

}

