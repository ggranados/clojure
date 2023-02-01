(ns exercises.core
  (:require [exercises.factorial :as fact]))

(def n 5)

(println "Factorial of " n " is =" (fact/fact n))