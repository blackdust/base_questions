def f(n)
  new_num = n/10
  puts n%10
  if new_num != 0
    f(new_num)
  end
end

f(98765)