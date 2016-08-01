find_catalog = (str)->
  exec = require('child_process').exec
  cmd_str = "pwd #{str}"
  exec cmd_str, (err,stdout,stderr)->
    if err
      console.log stderr
    else
      console.log stdout


find_catalog("text1")