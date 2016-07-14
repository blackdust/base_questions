def return_short_str(a, b)
  a_length = a.length
  b_length = b.length
  hash = {a_length => a ,b_length => b} 
  return hash[[a.length,b.length].min]
end

p return_short_str("asdasd", "asd")