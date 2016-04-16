(ns I-am-brave.apply-partial)

(apply max [1 2 3 4 7])
;; 7

(defn lets-into
  "Only a function that does the same thing that a into function"
  [first second]
  (apply conj first second))

(lets-into [2 3] [4 5 6 7])
;; [2 3 4 5 6 7]
