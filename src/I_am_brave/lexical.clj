(ns I-am-brave.lexical)

(let [x 1] x)

(let [[a b] [1 2]]
  (+ a b))

(let
  [[k x :as crazy-function] [(+ (inc 2) (inc 2))]]
  (println crazy-function))
