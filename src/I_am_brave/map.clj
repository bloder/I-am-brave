(ns I-am-brave.map)

(defn map-phrase
  [initial-word]
  (str initial-word ", This is my name, idiot"))

(map map-phrase ["Daniel", "Bloder"])
;;=> "Daniel, this is my name, idiot" "Bloder, this is my name, idiot"

(def man-age [18 19 17 21])
(def woman-age [16 15 21 25])
(defn compare-ages
  [man woman]
  {:man man
   :woman woman})

(map compare-ages man-age woman-age)
;; ({:man 18, :woman 16} {:man 19, :woman 15} {:man 17, :woman 21} {:man 21, :woman 25})

(map #(str "Hello my name is " %) ["Bloder" "Daniel" "Ronaldo"])
;; ("Hello my name is Bloder" "Hello my name is Daniel" "Hello my name is Ronaldo")
