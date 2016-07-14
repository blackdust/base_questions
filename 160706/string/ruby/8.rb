def move_left(num, str)
  num.times do
   head_str = str[0]
   str = str + head_str
   str[0] = ""
  end
  p str
end

move_left(2, "12345")