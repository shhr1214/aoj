def bubble_sort(a)
  num = 0
  for i in 0..(a.length-1)
    (a.length-1).downto(i+1) do |j|
      if a[j][1] < a[j-1][1]
        a[j], a[j-1] = a[j-1], a[j]
        num += 1
      end
    end
  end
  return a.join(" ") + "\n"
end

def selection_sort(a, n)
  (0..(n-1)).each do |i| 
    minj = i
    (i..(n-1)).each do |j| 
      if a[j][1] < a[minj][1]
        minj = j
      end
    end
    if a[i][1] != a[minj][1]
      a[i], a[minj] = a[minj], a[i]
    end
  end
  return a.join(" ") + "\n"
end

if __FILE__ == $0
  n = gets.to_i
  a = gets.split(" ")
  result1 = bubble_sort(a)
  result2 = selection_sort(a, n)
  puts result1
  puts 'Stable'
  puts result2
  if result1 == result2 then
    puts 'Stable'
  else
    puts 'Not stable'
  end
end
