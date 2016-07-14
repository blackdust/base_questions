def count_hash(ary)
  hash = {}
  ary.uniq.each do |find_str|
    hash["#{find_str}"] = 0
    ary.each do |x|
      if find_str == x 
        hash["#{find_str}"] = hash["#{find_str}"] + 1
      end
    end
  end
  return hash
end


p count_hash(["a", "b", "a", "a", "d", "b", "c", "d"])

