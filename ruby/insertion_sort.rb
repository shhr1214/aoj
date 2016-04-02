def insertion_sort(n, a)
  for i in 0..n-1
    v = a[i]
    j = i - 1
    while j >= 0 && a[j] > v
      a[j+1] = a[j]
      j = j - 1
    end
    a[j+1] = v
    print a.join(" ") + "\n"
  end
end

if __FILE__ == $0
  n = gets.to_i
  a = gets.split(" ").map(&:to_i)
  p a
  insertion_sort(n, a)
end
