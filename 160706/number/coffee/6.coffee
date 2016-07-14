f = (n)->
  ary = []
  for i in [1..n]
    ary.push(i)
  found_prime = [2]
  ary.splice(ary.indexOf(found_prime[0]), 1) 
  for i in [3..n]
    prime_flag = true
    for prime_num in found_prime
      if i % prime_num == 0
        prime_flag = false
        break
    if prime_flag
      found_prime.push(i)
      ary.splice(ary.indexOf(i), 1) 
  console.log(ary)

f(10)