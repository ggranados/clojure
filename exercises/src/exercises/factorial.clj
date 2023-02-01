(ns exercises.factorial)

(defn fact [n]
  (if (zero? n) 1
      (* n (fact (dec n)))))
