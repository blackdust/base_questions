f = (n)->
  found_prime =[2]
  for i in [3..n]
    prime_flag = true
    for prime_num in found_prime
      if i % prime_num == 0
        prime_flag = false
        break
    if prime_flag
      found_prime.push(i)
  console.log(found_prime)

f(10)