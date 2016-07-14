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
  console.log unique(unique(ary1).concat(unique(ary2)))

f(["a","b","c"],["c","f"])