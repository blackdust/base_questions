f = (x, y)->
  ary = []
  for i in [x..y]
    ary.push(i)

  for i in [ary[0]..ary[ary.length - 1]]
    line = ""
    for x in [1..i]
       line += "x"
    console.log(line)
  
f(4,3)