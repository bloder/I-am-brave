(ns I-am-brave.lazyness)

(let [foo (range 200)
      even (filter even? foo)
      bar (take 4 even)] bar)
;; (0 2 4 6)

(concat (take 3 (repeat "ela kika")) ["na" "vara"])
;; ("ela kika" "ela kika" "ela kika" "na" "vara")
