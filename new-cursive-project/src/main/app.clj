(ns main.app)
(require '[new-cursive-project.hello :as hello])

(defn main []
  (println "Welcome to my first Clojure app!")
  (hello/foo "Clojure!")
)

(main)