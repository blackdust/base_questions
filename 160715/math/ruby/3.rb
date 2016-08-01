def f(n)
  first_fall_meters = 100
  meters_count = rise_and_fall(100, n-1)
  puts "总计有#{meters_count + first_fall_meters}m"
end

def rise_and_fall(before_fall_height, times)
  a     = before_fall_height.to_f
  count = 0
  for i in 1..times
    count = count + a
    a = a * 0.5
  end
  puts "第#{times + 1 }次落地后，还会弹起#{a/2}m"
  return count
end

f(4)