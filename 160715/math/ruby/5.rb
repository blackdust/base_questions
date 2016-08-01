def f(month_count)
  arg = []
  if month_count > 2
    arg[0] = 1
    arg[1] = 1
    count  = 2
    for x in 3..month_count
      arg[x - 1] = arg[x - 2] +arg[x - 3]
      count = count + arg[x - 1]
    end
    puts month_count.to_s+"月后有"+(count*2).to_s+"只兔子" 
  else
    puts month_count.to_s+"月后有2只兔子" 
  end
end

f(4)