(ns I-am-brave.macro)

(defmacro sum-macro
  [form]
  (butlast form))

(sum-macro (+ 2 2 3))
;; 4

;; OMG LOOK THIS EXAMPLE
(defmacro build-operation
  [oper]
  (list (second oper)
        (first oper)
        (last oper)))

(build-operation (5 + 7))
;; 12

(build-operation (8 * 2))
;; 16

(build-operation (6 / 2))
;; 3

(defmacro crazy-sum-macro
  [numbers]
  (inc (second numbers)))

(crazy-sum-macro (+ 2 2))
;; 3

(defmacro clojure-good-codes
  [badcode goodcode]
  (list 'do
        (list 'println str "this is a bad code in clojure : "
              (list 'quote badcode))
        (list 'println str "this is a good code in clojure : "
              (list 'quote goodcode))))

(clojure-good-codes (1 + 1) (+ 2 2))
;; this is a bad code in clojure :  (1 + 1)
;; this is a good code in clojure :  (+ 2 2)
