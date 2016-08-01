check_file_exist = (name)->
  fs = require('fs')
  fs.exists name,(err, data)->
    if err
      console.error(err)
    else
      console.log(data)

check_file_exist("./text1")
check_file_exist("./xxtext1")