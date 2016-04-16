(ns I-am-brave.lazyness)

;; (0 2 4 6)
(let [foo (range 200)
      even (filter even? foo)
      bar (take 4 even)] bar)

(concat (take 3 (repeat "ela kika")) ["na" "vara"])
;; ("ela kika" "ela kika" "ela kika" "na" "vara")
