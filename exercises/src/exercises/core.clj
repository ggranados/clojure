(ns exercises.core
  (:require [exercises.factorial :as fact]))

(def n 100)

(println "Factorial of " n " is =" (fact/fact-recur n))