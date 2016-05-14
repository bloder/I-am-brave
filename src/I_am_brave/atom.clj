(ns I-am-brave.atom)

(def bloder (atom {:name "Daniel" :age 18}))
;; We can call this atom with @bloder and it will return
;; {:age 18, :name "Daniel"}
