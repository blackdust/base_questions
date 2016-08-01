f = (n)->
  first_fall_meters = 100
  meters_count = rise_and_fall(100, n-1)
  console.log "总计有#{meters_count + first_fall_meters}m"

rise_and_fall = (before_fall_height, times)->
  count = 0
  for i in [1..times]
    count = count + before_fall_height
    before_fall_height *= 0.5
  console.log "第#{times + 1 }次落地后，还会弹起#{before_fall_height /2}m"
  return count
  

f(4)
