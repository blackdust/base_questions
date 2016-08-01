def file_exist(a)
  if File::exists?(a)
    puts "找到文件 程序结束"
  else
    puts "找不到文件 程序结束"
  end
end

file_exist("text1")
file_exist("text2")
