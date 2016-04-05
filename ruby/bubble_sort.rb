def bubble_sort(a)
  num = 0
  for i in 0..(a.length-1)
    (a.length-1).downto(i+1) do |j|
      if a[j] < a[j-1]
        a[j], a[j-1] = a[j-1], a[j]
        num += 1
      end
    end
  end
  puts a.join(" ") + "\n"
  puts num
end

if __FILE__ == $0
  n = gets.to_i
  a = gets.split(" ").map(&:to_i)
  bubble_sort(a)
end
