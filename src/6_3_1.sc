val list1 = List(1, 3, 5, 7)
val list2 = List(1, 2, 4, 6, 8)
val list3 = List(1, 2, 3, 5, 8, 10, 12, 14)

for {
  x <- list1
  y <- list2 if x != y
  ml = x * y
  z <- list3 if z == ml
  }
  yield println((x, y))

//result.foreach(x => println(x))