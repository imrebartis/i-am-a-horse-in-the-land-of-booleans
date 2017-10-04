(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- x x x)
    x))

(defn divides? [divisor n]
  (cond
      (zero? (mod n divisor)) true
      :else false))

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (if (<= 13 age 19))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
