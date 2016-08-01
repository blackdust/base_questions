write_file = (name, num)->
  fs = require('fs')
  atr = []
  if num>1
    for x in [1..num]
      atr.push(x.toString()+"\n")
  else
    for x in [num..1]
      atr.unshift(x.toString()+"\n")
  content = atr.join('')

  fs.writeFile name,content,(err)->
    if err
      console.error(err)
    console.log("成功")

write_file("./text4", -5)