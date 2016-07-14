f = (ary)->
  new_ary= []
  for i in [0..ary.length - 1]
    num = Math.ceil(Math.random()*(ary.length))
    new_ary.push(ary[num - 1])
    ary.splice(num - 1, 1)
    
  console.log new_ary

  
f([1,2,3])
       