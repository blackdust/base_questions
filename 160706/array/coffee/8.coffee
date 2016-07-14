f = (ary)->
  hash = {}
  for i in [0..ary.length - 2]
    hash[ary[i]] = ary[i + 1]

  console.log hash


f(["a","b","c","d"])