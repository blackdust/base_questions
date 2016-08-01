def create_file(file_name ,str)
  require 'fileutils'
  file1 = File.new(file_name,"w")
  file1.syswrite(str)
  file1.close
end


create_file("text1", "abc")