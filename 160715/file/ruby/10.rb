def delete(str)
  puts "等待5秒后删除"
  sleep 5
  File.delete(str)
  if !File::exists?(str)
    p "成功删除"
  end
end

delete("text10")