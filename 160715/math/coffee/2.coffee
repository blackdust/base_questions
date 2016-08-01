f= (n)->
  str = n.toString().split("").reverse().join("")
  for i in [0..str.length-1]
    console.log str[i]



f(12345)

  
