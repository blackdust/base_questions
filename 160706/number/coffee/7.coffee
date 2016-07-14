get_unprime_num = (n)->
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
  ary

get_prime_nums = (n)->
  found_prime =[2]
  for i in [3..n]
    prime_flag = true
    for prime_num in found_prime
      if i % prime_num == 0
        prime_flag = false
        break
    if prime_flag
      found_prime.push(i)
  return found_prime

make_coupes_deal_other_number = (may_deal_num, result_ary, prime_number_ary)->
  for i in prime_number_ary
    if may_deal_num % i == 0
      result_ary.push([i, may_deal_num / i])
      if may_deal_num / i != 1
        make_coupes_deal_other_number(may_deal_num / i, result_ary, prime_number_ary)
  return result_ary

print = (num, ary)->
  yingshu = []
  for i in ary
    yingshu.push(i[0])
  console.log(num + "="+yingshu.join("x"))

decompose = (n)->
  prime_number = get_prime_nums(n)
  other_number = get_unprime_num(n)
  first_num = other_number.splice(0, 1)
  print(1, [[1],[1]])
  for num in other_number
    reasult_ary = make_coupes_deal_other_number(num, [], prime_number)
    resault_ary_pick = []
    for x in reasult_ary
      resault_ary_pick.push(x)
      if x[1] == 1
        break
    print(num, resault_ary_pick)

decompose(10)    




