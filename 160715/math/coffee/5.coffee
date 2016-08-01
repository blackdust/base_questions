f = (month_count)->
  arg = []
  if month_count > 2
    arg[0] = 1
    arg[1] = 1
    count = 2
    for x in [3..month_count]
      arg[x-1] = parseInt(arg[x-2]) + parseInt(arg[x-3])
      count = count + arg[x-1]
    console.log "#{month_count}月后有#{count*2}只兔子"
  else
    console.log "#{month_count}月后有2只兔子"



f(4)
f(2)