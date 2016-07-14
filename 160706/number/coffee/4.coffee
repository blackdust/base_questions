f = (a, b)->
  ary = [a, b]
  ary.sort (a, b)-> a - b
  for i in [ary[0]..ary[1]]
    console.log i

f(6,2)
