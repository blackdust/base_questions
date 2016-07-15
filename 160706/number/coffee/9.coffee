f = (n)->
  line_length  = 2 * n - 1
  ary = [] 
  for i in [1..n  - 1]
    blank_str = ""
    fill_in_str = ""
    for x in [1..n - i]
      blank_str += " "
    for y in [1..line_length - 2 * (n - i)]
      fill_in_str += "x"
    ary.push(blank_str + fill_in_str + blank_str)
  ary2 = []
  for i in ary
    ary2.push(i)
  center_line = ""
  for i in [1..n * 2 -1]
    center_line += "x"
  ary2.push(center_line)
  ary3 = ary2.concat(ary.reverse())
  for i in ary3
    console.log(i)
f(4)