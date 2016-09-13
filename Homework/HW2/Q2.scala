/** YOU WILL GET 3 SEPERATE FUNCTIONS. DEFINE A LIST OF YOUR CHOICE. "Ex: L". Then put length(L). You get an integer.
  * Put Hlv(Integer) = ans. Then use split(ans,L)
  * SPLIT FUNCTION TAKES IN HALF OF THE LIST LENGTH AND GIVES US A SPLIT LIST 
  */





def length[A](l:List[A]):Int = {
    l.length
}

def Hlv(x: Int) = x/2





def split(n: Int, l: List[Int]):(List[Int], List[Int]) = {
    def _split(c: Int, res: List[Int], rem: List[Int]):(List[Int],List[Int]) = (c, rem) match {
        case (_, Nil) => (res, Nil)
        case (0, rem) => (res, rem)
        case (c, h::tail) => _split(c - 1, res:::(List(h)), tail)
    }
    _split(n, List(), l)
}
