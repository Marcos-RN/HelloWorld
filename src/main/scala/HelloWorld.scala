
object HelloWorld {
  def main(args: Array[String]): Unit = {
    print("Hello World Scala")
  }

  def prefijoComun(n1: Int, n2: Int): Int = {
    require(n1>0 && n2>0)
    var x = n1
    var y = n2
    var z = 0
    // Punto A
    while(x!=y) {
      // Punto B
      z = z+1
      // Punto C
      if(x>y) {
        // Punto D
        x = x/10
      } else {
        //Punto E
        y = y/10
      }
      // Punto F
    }
    // Punto G
     x
  }

  print(prefijoComun(32845,32892934))

}