(ns I-am-brave.lazyness)

;; (0 2 4 6)
(let [foo (range 200)
      even (filter even? foo)
      bar (take 4 even)] bar)
