(ns I-am-brave.get)

(get [1 2 3 4 5 6] 0)
;; 1
(get {:foo 34 :bar 56} :bar)
;; 56
(get-in {:foo [{:bar 23}]} [:foo 0 :bar])
;;23
