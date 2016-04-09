(ns I-am-brave.core
  (:use [I-am-brave.destructuring :as destructuring])
  (:use [I-am-brave.lambda :as lambda])
  (:use [I-am-brave.closure :as closure])
  (:use [I-am-brave.lexical :as lexical])
  (:use [I-am-brave.loop :as loop-ns])
  (:use [I-am-brave.map :as map-ns])
  (:use [I-am-brave.take-drop :as take-drop-ns]))

(defn -main
  [& args]
  (drop 2 take-drop-ns/str-veq))
