joint_file = (a, b)->
  fs = require('fs')
  str = ""
  fs.readFile a,(err, data)->
    if err
      console.error(err)
    str = str + data.toString()


  fs.readFile b,(err, data)->
    if err
      console.error(err)
    str = str+ data.toString()
    
    fs.writeFile "fout", str,(err)->
      if err
        console.error(err)
      console.log("成功")

joint_file("j1", "j2")