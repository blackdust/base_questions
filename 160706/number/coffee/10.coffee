f = (x, y)->
  ary = []
  if (x > y)
   max = x
   min = y
  else
   max = y
   min = x
    
  for i in [min..max]
    ary.push(i)

  for i in [ary[0]..ary[ary.length - 1]]
    line = ""
    for x in [1..i]
       line += "x"
    console.log(line)
  
f(3,4)