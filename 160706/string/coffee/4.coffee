f = (str)->
  ary = str.replace(/(.)(?=[^$])/g,"$1,").split(",")
  strs = ""
  for x in ary.reverse()
    strs += x
  console.log(strs) 

f("xyz")