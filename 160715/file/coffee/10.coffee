del = (name)->
  fs = require('fs')
  fs.unlink name, (err)->
    if err
      console.error(err)
    console.log("删除成功")


del_file = (name)->
  console.log "等待5秒后删除"
  setTimeout ()->
    del(name)
  ,5000



del_file("text10")