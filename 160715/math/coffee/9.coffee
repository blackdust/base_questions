layer_count = (n)->
  x = 2
  y = 0
  y++ while n>= Math.pow(x, y)
  y
  
f = (m, n)->
  ary = [[m ,n], [layer_count(m),layer_count(n)]]
  if ary[1][0] == ary[1][1]
    console.log  "祖先就是" + same_layer_find_ancestor(ary[0][0], ary[0][1])
  else
    max_to_min_layer_ancestor = ary[0][ary[1].indexOf(Math.max(ary[1][0],ary[1][1]))] / 2**(Math.max(ary[1][0],ary[1][1]) - Math.min(ary[1][0],ary[1][1]))
    if max_to_min_layer_ancestor == Math.min(ary[0][0],ary[0][1])
       console.log  "祖先就是" + Math.min(ary[0][0],ary[0][1]).toString()
    else
      console.log "祖先就是" + same_layer_find_ancestor(max_to_min_layer_ancestor, Math.min(ary[0][0],ary[0][1]))


same_layer_find_ancestor = (num1,num2)->
  while parseInt(num1) isnt parseInt(num2) 
    num1 = parseInt(num1/2)
    num2 = parseInt(num2/2)
  num1
      

f(22,25)
f(16,17)
f(16,11)
