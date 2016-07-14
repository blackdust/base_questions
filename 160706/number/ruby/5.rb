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
  p found_prime
end


make_prime_number(10)