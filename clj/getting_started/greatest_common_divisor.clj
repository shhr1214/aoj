(ns getting-started.greatest-common-divisor
  (:require  [clojure.string :as cstr]))

(defn gcd
  [x y]
  (if (= 0 y)
    x
    (recur y (mod x y))))
