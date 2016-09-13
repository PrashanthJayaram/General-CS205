/** you can do natural looking arithmetic operations with a BigInt.
  *The operations and memory use of "BigInt" is dependent on the size of the number it is representing, and generally performs slower than the other integral types. 
  *Since it has arbitrary precision, computation done purely using "BigInt" never results in integer overflow or underflow
  */


def fact(x: BigInt): BigInt = 
if (x==0) 1 else x * fact (x-1)