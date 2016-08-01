factorial = (n)->
  if n == 0
    1
  else
    n * factorial(n-1)

f = (n)->
  str = factorial(n).toString().split("").reverse().join("")
  count = 0
  for x in [0..str.length-1]
    if str[x] == "0"
      count++
    else
      break
  console.log(count)


f(20)