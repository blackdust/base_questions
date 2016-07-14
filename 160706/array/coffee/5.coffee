f = (elements)->
 for i in [0..elements.length]
     for j in [0..elements.length - 1]
       if elements[j] > elements[j + 1]
         swap = elements[j]
         elements[j] = elements[j + 1]
         elements[j + 1] = swap
 elements

console.log f([3, 1, 5, 7, 2, 4, 9, 6, 10, 8])