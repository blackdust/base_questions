def deal_a1_a2(a1,a2)
  p (a1.uniq + a2.uniq).uniq
end

deal_a1_a2(["1", "2", "3", "3", "4"], ["3", "4", "5", "3"])