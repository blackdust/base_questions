def range_num(a, b)
 ary = [a,b] 
 x = ary.max
 ary.delete(x)
 for i in ary[0]..x
   p i
 end
end

range_num(8,4)