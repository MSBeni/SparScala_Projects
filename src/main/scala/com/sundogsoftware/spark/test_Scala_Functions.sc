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


def cubeIt(x : Int) : Int = {x * x * x}

println(cubeIt(3))

def transformInt(x: Int, f: Int => Int): Int = {
  f(x)
}

val result = transformInt(2, cubeIt)
println(result)

transformInt(3, x => x * x * x)

transformInt(10, x => x / 2)

transformInt(2, x => {val y = x * 2; y * y})