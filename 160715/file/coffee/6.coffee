getFileSize = (name)->
  fs = require('fs')
  fs.exists name,(err, data)->
    if err
      s = fs.statSync name
      console.log s.size
    else
      console.log null

getFileSize("text4")
getFileSize("text111")