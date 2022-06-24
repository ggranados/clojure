(ns main.app)
(require '[new-cursive-project.hello :as hello])
(require '[edu.ggranados.clojure.calc :as calc])

(defn main []                                               ; main function
  (println "Welcome to my first Clojure app!")              ; calling print function
  (hello/greet "Clojure!")                                  ; calling custom function

  (def a 2)                                                 ; define a number
  (def b 3)                                                 ; define b number

  ; calling custom calculator methods
  (println  "Sum of " a "+" b "=" (calc/sum a b))
  (println "Subtraction of " a "-" b "=" (calc/sub a b))
  (println "Multiplication of " a "*" b "=" (calc/mul a b))
  (println "Division of " a "%" b "=" (calc/div a b))

)
; calling main function
(main)