(ns I-am-brave.core
  (:use [I-am-brave.destructuring :as destructuring])
  (:use [I-am-brave.lambda :as lambda])
  (:use [I-am-brave.closure :as closure]))

(defn -main
  [& args]
  (closure/closure-function 2))
