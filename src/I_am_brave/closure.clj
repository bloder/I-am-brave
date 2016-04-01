(ns I-am-brave.closure)

(defn sum-example-for-closure
  "Here's just a simple example to be called by a closure"
  [sum]
  #(+ % sum))

(def closure-function
  "Closure function example... I loved this *-----* "
  (sum-example-for-closure 5))
