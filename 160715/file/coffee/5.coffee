del = (name)->
  fs = require('fs')
  fs.unlink name, (err)->
    if err
      console.error(err)
    console.log("删除成功")

create_and_del_file = (name)->
  fs = require('fs')
  fs.writeFile name,"",(err)->
    if err
      console.error(err)
    console.log("创建成功")
  setTimeout ()->
    del(name)
  ,5000


create_and_del_file("text5")