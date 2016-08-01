def read_file(a)
  File.open(a,"r") do |file|
    while line  = file.gets
      puts line #打印出文件内容
     end
  end
end

read_file("text1")
