def make_prime_number(n)
  found_prime = [2]
  for i in 3..n
    prime_flag = true
    found_prime.each do |prime_num|
      if i % prime_num == 0
        prime_flag = false
        break;
      end
    end
    if prime_flag
      found_prime.push(i)   
    end
  end
  return found_prime
end

def delete_prime_number(n)
  ary = []
  for i in 1..n
    ary.push(i)
  end
  return ary - make_prime_number(n)
end

def make_coupes_deal_other_number(may_deal_num, result_ary, prime_number_ary)
    for i in prime_number_ary
      if may_deal_num % i == 0
        result_ary.push([i, may_deal_num / i])
        if may_deal_num / i != 1
          make_coupes_deal_other_number(may_deal_num / i, result_ary, prime_number_ary)
        end
      end
    end
    return result_ary
end

def print(num ,ary)
  ary1 = ary.map do |a|
    a[0].to_s
  end
  p num.to_s + " 分解后= "
  p ary1
end

def decompose(n)
  prime_number = make_prime_number(n)
  other_number = delete_prime_number(n)
  other_number.delete(1)
  print(1, [1])
  other_number.each do |num|
    reasult_ary = make_coupes_deal_other_number(num, [], prime_number)
    resault_ary_pick = []
    reasult_ary.each_with_index do |x|
      resault_ary_pick.push(x)
      if x[1] == 1 
        break;
      end
    end
    print(num, resault_ary_pick)
  end
end
decompose(50)