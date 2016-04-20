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
