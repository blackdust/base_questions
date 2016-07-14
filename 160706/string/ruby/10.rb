def reg_get_index(str, reg)
  m = reg.match(str)
  if m.nil?
    return -1
  else
    return  m.begin(0)+1
  end 
end

p reg_get_index("你好去123哦a早上好a", /[a-z]/)
p reg_get_index("你好去123哦早上好", /[a-z]/)