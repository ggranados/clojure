(ns exercises.factorial_test
  (:require [clojure.test :refer :all]
            [exercises.factorial :as fact]))

(deftest factorial-of-valid-integer
  (testing
    (is
      (fact/fact 5) 120)))

(deftest factorial-of-zero
  (testing
    (is
      (fact/fact 0) 1)))
