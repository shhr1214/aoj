(ns getting_started.prime-numbers)

(defn is-sqrt-prime?
  [n]
  (loop [i 3
         n (int (Math/sqrt n))]
    (if (< n i)
      true
      (if (= (mod n i) 0)
        false
        (recur (+ i 2) n)))))

(defn is-prime?
  [n]
  (cond
    (= n 2) true
    (< n 2) false
    :else (is-sqrt-prime? n)))

(defn count-prime-numbers
  [n]
  (loop [result 0
         n n]
    (if (empty? n)
      result
      (if (is-prime? (first n))
        (recur (+ result 1) (rest n))
        (recur result (rest n))))))
