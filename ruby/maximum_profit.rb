if __FILE__ == $0
  n = gets.to_i
  r1 = gets.to_i
  r2 = gets.to_i
  max_diff = r2 - r1
  min_value = r2 < r1 ? r2 : r1
  for i in 0..(n-2)
    r3 = gets.to_i
    max_diff = (r3 - min_value) < max_diff ? max_diff : (r3 - min_value)
    min_value - min_value < r3 ? min_value : r3
  end

  print max_diff
end
