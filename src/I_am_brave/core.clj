(ns I-am-brave.core
  (:use [I-am-brave.destructuring :as destructuring])
  (:use [I-am-brave.lambda :as lambda])
  (:use [I-am-brave.closure :as closure])
  (:use [I-am-brave.lexical :as lexical])
  (:use [I-am-brave.loop :as loop-ns]))

(defn -main
  [& args]
  ((loop-ns/other-boring-sum-function 2)))
