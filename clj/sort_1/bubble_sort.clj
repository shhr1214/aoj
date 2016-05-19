(ns sort-1.bubble-sort)

(defn- b-sort
  [xs]
  (loop [xs xs
         result []]
    (if (empty? (rest xs))
      (conj result (first xs))
      (if (< (first xs) (second xs))
        (recur (rest xs) (conj result (first xs)))
        (recur (cons (first xs) (drop 2 xs)) (conj result (second xs)))))))

(defn bubble-sort
  [xs]
  (let [xs xs
        ys (b-sort xs)]
    (if (= xs ys)
      xs
      (recur ys))))

(println (bubble-sort [5 3 2 4 1])) ;; 8
(println (bubble-sort [5 2 4 6 1 3])) ;; 9
