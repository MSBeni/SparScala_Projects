// Functions

// format def <function name>(parameter name: type...) : return type = { }

def fibonacci_check(n:Int):Long= {
  if (n == 1) return 1
  var x = 0
  var y = 1
  for (i <- 0 to n) {
    var s = x + y
    x = y
    y = s
  }
  return x
}

println(fibonacci_check(5))