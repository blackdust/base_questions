def move_right(num, str)
  num.times do
   end_str = str[str.length-1]
   str = end_str + str.chop 
  end
  p str
end


move_right(2, "12345")