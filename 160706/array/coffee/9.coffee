unique = (array)->
  n = []
  for i in[0..array.length]
    if n.indexOf(array[i]) == -1
      n.push(array[i])
  for i in [0..n.length - 1]
    if n[i] == undefined
      n.splice(i, 1)
  n

f = (ary1,ary2)->
  ary = []
  for i in unique(ary1)
    for j in unique(ary2)
      if i == j
        ary.push(i) 
  console.log ary
    



f(["a", "b", "c"],["c", "f"])