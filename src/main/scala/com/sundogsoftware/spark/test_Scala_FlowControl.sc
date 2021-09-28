// Flow Control

//If-else Statements

if (2>4) println("Yes, You're right ...") else println("ridiculous, ...")

if (6>4){
  println("Yes, You're right ...")
  println("Confirming multiple line ...")
}else{
  println("ridiculous ...")
  println("Confirming multiple line ...")
}


// Matching
val number = 2
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")   // _ for if nothing match scenario
}


for (x <- 2 to 5){
  var calc = x*x
  println(calc)
}


var x = 15
while (x >= 2){
  println(x%2)
  x -= 1
}

var y = 1
var l = 0
val n = 10
for (i <- 1 to n){
  var m = y+l
  l = y
  y = m
  println(m)
}