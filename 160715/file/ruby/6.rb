
def count_size(file_name)
  if File::exists?(file_name)
    size = File.size(file_name) 
    return size
  else
    return nil
  end
end
puts count_size("text1")
puts count_size("22")

