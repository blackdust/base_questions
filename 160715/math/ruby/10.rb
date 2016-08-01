def f(n)
  count = n
  while n-1 > 0  do
    count = count *(n-1)
    n = n-1
  end

  zero_count = 0
  for i in 0..count.to_s.reverse.length-1
    if count.to_s.reverse[i] == "0"
      zero_count += 1
    else
      break
    end
  end
  puts zero_count
end



f(20)
