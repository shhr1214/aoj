(ns getting-started.maximum-profit)

(defn max-profit
  [lst]
  (loop [result (- (second lst) (first lst))
         minv (min (second lst) (first lst))
         lst (drop 2 lst)]
    (if (empty? lst)
      result
      (recur
       (if (< result (- (first lst) minv))
         (- (first lst) minv)
         result)
       (min (first lst) minv)
       (rest lst)))))

(println (max-profit [5 3 1 3 4 3]))
(println (max-profit [4 3 2]))
