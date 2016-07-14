def combine(ary)
  str =""
  ary.each do |x|
    str += x
  end
  p str
end

combine(["a", "b", "c"])