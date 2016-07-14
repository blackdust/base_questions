def Trapezoid(x, y)
  ary = [x, y]
  for i in ary.min..ary.max
    p "x" * i
  end
end

Trapezoid(2, 5)
Trapezoid(7, 2)
