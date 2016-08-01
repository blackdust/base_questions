def catalog_exist?(str)
p File.directory? str
end

catalog_exist?("../ruby")
catalog_exist?("../rxxuby")