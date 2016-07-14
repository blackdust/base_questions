def  pirint_100_n(n)
    if n < 100
      ary = []
      for i in n..100
        ary.push(i)
      end
      ary.reverse.each do |x|
        p x
      end
    elsif  n == 100
      p 100
    else n > 100
      for i in 100..n
        p i
      end
  end
end

pirint_100_n(96)