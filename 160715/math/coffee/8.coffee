f  = (n)->
  twenty_five_max = parseInt(n/25)
  for i in[0..twenty_five_max]
    twenty_five_yushu = n - 25 * i
    ten_max = parseInt(twenty_five_yushu / 10)
    for m in [0..ten_max]
      ten_yushu = twenty_five_yushu - 10 * m
      five_max = parseInt(ten_yushu / 5)
      for x in [0..five_max]
        five_yushu = ten_yushu - 5 * x
        one_max = parseInt(five_yushu / 1)
        console.log "25元#{i}个，10元#{m}个，5元#{x}个，1元#{one_max}个"
  

f(25)