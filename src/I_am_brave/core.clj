(ns I-am-brave.core
  (:use [I-am-brave.destructuring :as destructuring]
        [I-am-brave.simple-sintax :as simple-sintax]))

(def anonymous-function
  "Anonymous Function example"
  (fn [x] (*(+ x x)(* 10 5))))

(def other-anonymous-function
  "Other way to call anonymous function with params"
  (#(* % 2) 8))

(defn sum-example-for-closure
  "Here's just a simple example to be called by a closure"
  [sum]
  #(+ % sum))

(def closure-function
  "Closure function example... I loved this *-----* "
  (sum-example-for-closure 5))

(defn -main
  [& args]
  (simple-sintax/verify 2))
