(ns sort-1.selection-sort)

(defn nth-of-min
  [xs]
  (loop [x (first xs)
         xs (rest xs)
         n 0
         i 0]
    (if (empty? xs)
      n
      (recur (first xs)
             (rest xs)
             (if (< x (first xs)) n (inc i))
             (inc i)))))

(defn selection-sort
  [xs]
  (loop [xs xs
         sorted []]
    (if (empty? xs)
      sorted
      (let [f (first xs)
            n (nth-of-min xs)]
        (recur (if (= 0 n)
                 (rest xs)
                 (assoc (rest xs) (- n 1) f))
               (conj sorted (nth xs n)))))))

(println (selection-sort [5 6 4 2 1 3])) ;4
;;(println (selection-sort [5 2 4 6 1 3])) ;3

