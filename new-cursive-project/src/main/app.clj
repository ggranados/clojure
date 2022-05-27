(ns main.app)
(require '[new-cursive-project.hello :as hello])
(require '[edu.ggranados.clojure.calc :as calc])

(defn main []
  (println "Welcome to my first Clojure app!")
  (hello/foo "Clojure!")

  (def a 2)
  (def b 3)

  (println  "Sum of " a "+" b "=" (calc/sum a b))
  (println "Subtraction of " a "-" b "=" (calc/sub a b))
  (println "Multiplication of " a "*" b "=" (calc/mul a b))
  (println "Division of " a "%" b "=" (calc/div a b))

)

(main)