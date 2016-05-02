(ns I-am-brave.simple-sintax
  (:use [I-am-brave.destructuring :as destructuring])
  (:use [I-am-brave.lambda :as lambda]))

(defn verify
  "If - Else example"
  [x]
  (if (> x 1)
   (destructuring/destructuring ["Daniel" "Ronaldo" "Marcos"])
   (lambda/nonymous-function 1)))

;; PRIVATE FUNCTIONS
(def ^:private (fn [foo] (+ foo foo)))
(defn- sum-number [bar] (+ bar bar))
;; OR
(defn ^:private sum-number [foo] (+ foo foo))

(defn write-hello
  ([] "hello Bloder")
  ([name] (str "hello "  name))
  ([firstname lastname] (str "hello " firstname " " lastname)))

(write-hello "Daniel" "Martins")
;; hello Daniel Martins

(write-hello "Daniel")
;; hello Daniel

(write-hello)
;; hello Bloder
