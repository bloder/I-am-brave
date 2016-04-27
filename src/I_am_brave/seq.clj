(ns I-am-brave.take-drop)

(def number-veq [3 5 6 4 7])
(def str-veq ["Bloder" "Daniel" "Zika" "do" "Baile"])

(take 2 str-veq)
;; => ["Bloder" "Daniel"]

(take 2 number-veq)
;; => [3 5]

(drop 2 str-veq)
;; => ["Zika" "do" "Baile"]

(drop 2 number-veq)
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

(filter #(< (:age %) 14) name-collection)
;; ({:age 12, :name "Daniel"} {:age 13, :name "Bloder"})

(filter #(= (:name %) "Bloder") name-collection)
;; ({:age 13, :name "Bloder"})

(sort [3 1 2])
;;[1 2 3]

(sort-by count ["asdsa" "asd" "qw"])
;; ("qw" "asd" "asdsa")

(def sort-params
  "Concat two sorted params"
  (fn [x y] (concat (sort x) (sort y))))

(sort-params ["hey mom" "Hello"] ["clojure" "foo" "deu"])
;; ("Hello" "hey mom" "clojure" "deu" "foo")

(sort-params [54 34 21] [12 67 32 78])
;; (21 34 54 12 32 67 78)

(concat (sort [1 3 2]) (sort [7 5 8]))
;; (1 2 3 5 7 8)

(concat [2 3 5] [5 58 87 96])
;; (2 3 5 5 58 87 96)

(into ["DANIEL"] '("Bloder"))
;; ["DANIEL" "Bloder"]
