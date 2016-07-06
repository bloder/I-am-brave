(ns I-am-brave.closure)

(defn sum-example-for-closure
  "Here's just a simple example to be called by a closure"
  [sum]
  #(+ % sum))

(def closure-function
  "Closure function example... I loved this *-----* "
  (sum-example-for-closure 5))

(closure-function 2)
;; 7

(defn mapping
  "Map concat func using closure"
  [map]
  #(concat % map))

(def closure-mapping
  (mapping [1 2 3]))

(closure-mapping [2 3 4])
;; (2 3 4 1 2 3)
