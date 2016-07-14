def  quick_sort(a)
   (x = a.pop) ? quick_sort(a.select { |i| i <= x }) + [x] + quick_sort(a.select { |i| i > x }) : []
end
p quick_sort([9, 2, 4, 3, 7])