(ns I-am-brave.lambda)

(def anonymous-function
  "Anonymous Function example"
  (fn [x] (*(+ x x)(* 10 5))))

(def other-anonymous-function
  "Other way to call anonymous function with params"
  (#(* % 2) 8))
