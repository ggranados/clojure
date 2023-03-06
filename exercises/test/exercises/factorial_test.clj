(ns exercises.factorial_test
  (:require [clojure.test :refer :all]
            [exercises.factorial :as fact]))

(def FACT_100 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000)

;; Basic factorial
(deftest factorial-of-valid-integer
  (testing
    (is
      (= (fact/fact-basic 5)
      120))))

(deftest factorial-of-zero
  (testing
    (is
      (= (fact/fact-basic 0)
      1))))

(deftest factorial-big-integer-should-throw-exception
  (testing
    (is (thrown? ArithmeticException (fact/fact-basic 100)))))


;;Tail factorial

(deftest tail-factorial-valid-integer
  (testing
    (is
      (= (fact/fact_tail 5 1)
      120))))

(deftest tail-factorial-of-zero
  (testing
    (is
      (= (fact/fact_tail 1 1)
      1))))

(deftest tail-factorial-big-integer-should-throw-exception
  (testing
    (is (thrown? ArithmeticException (fact/fact_tail 100 1)))))

;; Proper tail recursive factorial
(deftest recur-factorial-valid-integer
  (testing
    (is
      (= (fact/fact-recur 5)
      120))))

(deftest tail-factorial-of-zero
  (testing
    (is
      (= (fact/fact-recur 1)
      1))))

(deftest recur-factorial-big-integer
  (testing
    (is
      (= (fact/fact-recur 100)
         FACT_100))))
