def Reverse_ary(ary)
  reverse_ary = []
  ary.each do |a|
    reverse_ary.insert(0, a)
  end
  reverse_ary.each do |a|
    p a
  end
end

Reverse_ary([1, 2, 3])