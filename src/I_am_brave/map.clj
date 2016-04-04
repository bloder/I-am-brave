(ns I-am-brave.map)

(defn map-phrase
  [initial-word]
  (str initial-word ", This is my name, idiot"))

(map map-phrase ["Daniel", "Bloder"])
;;=> "Daniel, this is my name, idiot" "Bloder, this is my name, idiot"
