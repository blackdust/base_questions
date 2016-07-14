f = (n)->
 n++
 line_length  = 2 * n - 1
 ary = [] 
 for i in [1..n * 2 - 1]
    if i < n
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
 ary3 = ary2.concat(ary.reverse())
 ary3.splice(ary3.length / 2, 1)
 for i in ary3
    console.log(i)
f(5)