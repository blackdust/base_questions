def transform_asc(str)
  for i in 0..str.length-1
    p str[i].ord
  end
end

transform_asc("abc")