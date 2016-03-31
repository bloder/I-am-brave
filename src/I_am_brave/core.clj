(ns I-am-brave.core
  (:use [I-am-brave.destructuring :as destructuring])
  (:use [I-am-brave.lambda :as lambda]))

(defn sum-example-for-closure
  "Here's just a simple example to be called by a closure"
  [sum]
  #(+ % sum))

(def closure-function
  "Closure function example... I loved this *-----* "
  (sum-example-for-closure 5))

(defn -main
  [& args]
  (lambda/anonymous-function 1))
