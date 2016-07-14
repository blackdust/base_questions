f = (str,reg)->
  if reg.exec(str) == null
    console.log -1
  else
    console.log reg.exec(str).index

f("xyzy",/z/)