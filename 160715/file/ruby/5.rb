def file_exist(a)
  if File::exists?(a)
    puts "找到文件 程序结束"
  else
    puts "找不到文件 程序结束"
  end
end

def create_and_del_file(file_name)
  require 'fileutils'
  file1 = File.new(file_name,"w")
  file1.close
  file_exist(file_name)
  puts "5秒后删除"
  sleep 5
  File.delete(file_name)
  file_exist(file_name)
end


create_and_del_file("text5")