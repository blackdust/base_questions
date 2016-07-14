def deal_arys(a1, a2)
  new_ary = []
  a1.uniq.each do |a1|
    a2.uniq.each do |a2|
      if a1 == a2
        new_ary.push(a1)
      end
    end
  end
  p new_ary
end

deal_arys(["1", "2", "3", "3", "4"], ["3", "4", "5", "3"])