(ns I-am-brave.simple-sintax
  (:use I-am-brave.destructuring :as destructuring))

(defn verify
  "If - Else example"
  [x]
  (if (> x 1)
   (destructuring/destructuring ["Daniel" "Ronaldo" "Marcos"])
   (anonymous-function 1)))
