def gcd(a, b)
  if b == 0
    return a
  else
    gcd(b, a%b)
  end
end

if __FILE__ == $0
  a, b = gets.split(" ").map(&:to_i)
  p a, b
  print (gcd(a, b))
end
