def selection_sort(a, n)
  times = 0
  (0..(n-1)).each do |i| 
    minj = i
    (i..(n-1)).each do |j| 
      if a[j] < a[minj]
        minj = j
      end
    end
    if a[i] != a[minj]
      a[i], a[minj] = a[minj], a[i]
      times += 1
    end
  end
  puts a.join(" ") + "\n"
  puts times
end

if __FILE__ == $0
  n = gets.to_i
  a = gets.split(" ").map(&:to_i)
  selection_sort(a, n)
end
