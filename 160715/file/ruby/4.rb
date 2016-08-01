def write_one_to_n(name, n)
  open(name, 'w') { |f|
  for x in 1..n do
    f << "#{x}\n"
  end
}
end

write_one_to_n("text4", 4)