object Q6{
def quickSort(l: List[Int]): List[Int] = l match {
    case Nil => Nil
    case head :: tail => {
        val (low, high) = tail.partition(_ < head)
        quickSort(low) ::: head :: quickSort(high)
    }
}
}
def main(args:Array[String]):Unit={
val l1=List(4,2,7,1,9)
println(quickSort(l1))}
}