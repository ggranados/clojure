(ns exercises.factorial)

(defn fact-basic [n]
  (if (zero? n) 1
                (* n (fact-basic (dec n)))))

(defn fact_tail [n acc]
  (if (zero? n) acc
                (fact_tail (dec n) (* n acc))))

(defn fact-recur [n]
  (loop [n n acc 1]
    (if (zero? n)
      acc
      (recur (dec n) (*' acc n)))))