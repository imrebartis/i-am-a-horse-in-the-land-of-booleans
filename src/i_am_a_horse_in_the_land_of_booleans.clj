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

(defn fizbuzz? [n]
  (cond
      (and (zero? (mod n 3)) (zero? (mod n 5))) "fizzbuzz"
      (zero? (mod n 3)) "fizz"
      (zero? (mod n 5)) "buzz"
      :else ""))

(defn teen? [age]
  (if (<= 13 age 19)
      true
      false
      ))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]

      (cond
        (number? x) (* x 2)
        (empty? x) nil
        (list? x) (* (count x) 2)
        (vector? x) (* (count x) 2)
        :else true
        )
    )

(defn leap-year? [year]
  ":(")

; '_______'
