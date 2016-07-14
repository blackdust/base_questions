def bubble_sort(seq)
  0.upto(seq.length-1) do |i|
    exchange = false
     0.upto(seq.length-1-i-1) do|j|
       if seq[j] > seq[j + 1]
         tmp = seq[j + 1]
         seq[j + 1] = seq[j]
         seq[j] = tmp
         exchange = true
       end
     end
    if !exchange
      break
    end
  end
  return seq
end

p bubble_sort([4, 3, 10, 7, 9, 2, 1])