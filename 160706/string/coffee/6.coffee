f = (a, b)->
  if a.length < b.length
    a
  else
    b

console.log f("xx","xxxx")