catalog_exist = (str)->
  fs = require('fs')
  fs.readdir str, (err, file)->
    if err
      console.log false
    else
      console.log true

catalog_exist("../ruby")
catalog_exist("../coffee11")