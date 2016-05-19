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
