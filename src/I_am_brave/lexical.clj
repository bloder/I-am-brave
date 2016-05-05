(ns I-am-brave.lexical)

(let [x 1] x)
;; 1

(let [[a b] [1 2]]
  (+ a b))
;; 3

(let
  [[k x :as crazy-function] [(+ (inc 2) (inc 2))]]
  (println crazy-function))
;; 6

(defn let-example
  [x]
  (let [y x c y]
    (println y " " c)))

(let-example 3)
;; 3 3

(defmacro sum-macro
  [foo]
  (list (second foo)
        (first foo)
        (last foo)))

(defn sum-wih-lexical-and-macro
  [foo bar]
  (let [x foo y bar]
    (sum-macro (x + y))))

(sum-wih-lexical-and-macro 2 5)
;; 7
