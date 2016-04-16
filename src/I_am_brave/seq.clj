(ns I-am-brave.take-drop)

(def number-veq [3 5 6 4 7])
(def str-veq ["Bloder" "Daniel" "Zika" "do" "Baile"])

;;(take 2 str-veq)
;; => ["Bloder" "Daniel"]

;;(take 2 number-veq)
;; => [3 5]

;;(drop 2 str-veq)
;; => ["Zika" "do" "Baile"]

;;(drop 2 number-veq)
;; => [6 4 7]

(def name-collection [
  {:name "Daniel" :age 12}
  {:name "Bloder" :age 13}
  {:name "Zikao" :age 14}
  {:name "Diguidin" :age 15}
  {:name "Sarrante" :age 16}
  {:name "Passinho do Romano" :age 17}
  ])

(take-while #(< (:age %) 16) name-collection)
;; ({:age 12, :name "Daniel"} {:age 13, :name "Bloder"} {:age 14, :name "Zikao"} {:age 15, :name "Diguidin"})

(drop-while #(< (:age %) 16) name-collection)
;; ({:age 16, :name "Sarrante"} {:age 17, :name "Passinho do Romano"})
