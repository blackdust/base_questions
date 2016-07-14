f = (time,str)->
  str_ary = []
  for i in [1..str.length]
    str_ary.push(str[i - 1]) 
  for x in [1..time]
    end = str_ary.pop()
    str_ary.unshift(end)
  str = ""
  for x in str_ary
    str += x
  console.log(str)


f(2, "12345")