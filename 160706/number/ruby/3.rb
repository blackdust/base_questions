def n_m(n, m)
  if n <= m
    for i in n..m
      p i
    end
  else
    ary = []
    for i in m..n
      ary.push(i)
    end
    ary.reverse.each do |x|
      p x
    end
  end
end

n_m(3, 1)