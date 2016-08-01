read_file = (name)->
  fs = require('fs')
  fs.readFile name,(err, data)->
    if err
      console.error(err)
    console.log("读取数据" + data.toString())

read_file("text1")