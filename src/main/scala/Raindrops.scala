object Raindrops:
   def convert(n: Int): String =
      val vs = Map(3 -> "Pling", 5 -> "Plang", 7 -> "Plong").filter(n % _._1 == 0).values
      if vs.isEmpty then n.toString else vs.mkString