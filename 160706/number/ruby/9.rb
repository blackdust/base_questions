def diamond(n)
  center_index  = (2 * n - 1) / 2 + 1 - 1
  diamond_str_ary = []
  for line_count in 1..n.to_i
    line_atr = " " * (2 * n - 1)
    for atr_index in 0..line_count-1
      line_atr[center_index] = "x"
      line_atr[center_index + atr_index] = "x"
      line_atr[center_index - atr_index] = "x"
    end
    if line_count < n
      diamond_str_ary.insert(line_count.to_i - 1, line_atr)
      diamond_str_ary.insert(diamond_str_ary.length.to_i - 1 - (line_count.to_i - 1), line_atr)
    else
      diamond_str_ary.insert(line_count.to_i - 1, line_atr)
    end
  end
  diamond_str_ary.each do |m|
    p m
  end
end


diamond(5)