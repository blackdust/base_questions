f = (ary)->
  hash = {}
  for i in ary
    if hash[i] == undefined
      hash[i] = 1
    else
      hash[i]++

  console.log hash


f(["a","b","b","a","f"])