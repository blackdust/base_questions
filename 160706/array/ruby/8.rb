def transfer(ary)
  hash = {}
  length = ary.length - 1
  for i in 0..length - 1
    hash["#{ary[i]}"] = ary[i + 1]
  end
  p hash
end

transfer(["1", "27", "4"])