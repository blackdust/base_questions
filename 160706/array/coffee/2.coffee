flatten = (ary,result)->
  for item in ary
    if item instanceof Array
      flatten(item, result)
    else
      result.push(item)
  return result

console.log flatten([1, [2, 3], 3],[])