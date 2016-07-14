def return_long_str(a, b)
  a_length = a.length
  b_length = b.length
  hash = {a_length => a ,b_length => b} 
  return hash[[a.length,b.length].max]
end

p return_long_str("asdasd", "asd")