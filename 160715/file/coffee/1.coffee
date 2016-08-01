create_file = (name, num)->
  fs = require('fs')
  fs.writeFile name,content,(err)->
    if err
      console.error(err)
    console.log("成功")

create_file("./text1",5)