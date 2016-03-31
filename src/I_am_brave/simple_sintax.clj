(ns I-am-brave.simple-sintax
  (:use [I-am-brave.destructuring :as destructuring])
  (:use [I-am-brave.lambda :as lambda]))

(defn verify
  "If - Else example"
  [x]
  (if (> x 1)
   (destructuring/destructuring ["Daniel" "Ronaldo" "Marcos"])
   (lambda/nonymous-function 1)))
