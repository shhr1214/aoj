(ns getting-started.insertion-sort
  (:require [clojure.string :as cstr]))

(defn str->int-array
  [s]
  (map #(Integer/parseInt %) (cstr/split s #" ")))

(defn insert
  [n lst]
  (loop [result []
         lst lst]
    (if (empty? lst)
      (concat result [n])
      (if (<= n (first lst))
        (concat result (cons n lst))
        (recur (conj result (first lst)) (rest lst))))))

(defn insertion-sort
  [a]
  (loop [result (list (first (str->int-array a)))
         rst (rest (str->int-array a))]
    (if (empty? rst)
      (cstr/join " " result)
      (do
        (println (cstr/join " " (concat result rst)))
        (recur (insert (first rst) result) (rest rst))))))

(println (insertion-sort
          (read-line)))
