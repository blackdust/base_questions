def joint_file(file1, file2)
  atr = []
  File.open(file1,"r") do |file|
    while line  = file.gets
      atr.push(line) 
     end
  end

  File.open(file2,"r") do |file|
    while line  = file.gets
      atr.push(line) 
     end
  end

  new_atr = atr.map do |x|
    if x[-1,1] != "\n"
      x +"\r\n"
    else
      x
    end
  end

  open("fout","w"){ |f|
    for x in new_atr do
      f << "#{x}"
    end
  }
end

joint_file("j1", "j2")
