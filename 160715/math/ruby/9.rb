def f(m, n)
  ary = [[m ,n], [layer_count(m),layer_count(n)]]
  if ary[1][0] == ary[1][1]
    p  "祖先就是" + same_layer_find_ancestor(ary[0][0], ary[0][1]).to_s
  else
    max_to_min_layer_ancestor = ary[0][ary[1].index(ary[1].max)] / 2**(ary[1].max - ary[1].min)
    if max_to_min_layer_ancestor == ary[0].min
      p "祖先就是" + ary[0].min.to_s
    else
      p "祖先就是" + same_layer_find_ancestor(max_to_min_layer_ancestor, ary[0].min).to_s
    end
  end
end

def layer_count(n)
  x = 2
  y = 0
  while n >= x**y  do
    y += 1
  end
  y
end

def same_layer_find_ancestor(num1 , num2)
  while num1 != num2 do
    num1 = num1/2
    num2 = num2/2
  end
  return num1
end


f(22,25)
f(16,8)
f(16,11)