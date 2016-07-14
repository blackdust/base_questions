def multilevel_flatten (ary)
  p ary.flatten
end

multilevel_flatten( [1, [2, [3, 4]]])

# 依次转换
def multilevel_flatten_by_each_layer(ary)
  p ary.flatten(1)
  y = ary.flatten(1).map do |x|
    if x.is_a? Array
      true
    else
      false
    end
  end
  if y.include?(true)
      multilevel_flatten_by_each_layer(ary.flatten(1))
  else
      p '结束'
  end
end
multilevel_flatten_by_each_layer([1, [2, 3], [4, [5, 6]]])