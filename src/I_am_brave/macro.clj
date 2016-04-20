(ns I-am-brave.macro)

(defmacro sum-macro
  [form]
  (butlast form))

(sum-macro (+ 2 2 3))
;; 4
