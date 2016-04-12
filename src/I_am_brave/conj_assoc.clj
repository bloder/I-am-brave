(ns I-am-brave.conj-assoc)

(conj [1 2 3 4 5] 6)
;;[1 2 3 4 5 6]

(let [foo [1 2 3 4]
      bar (conj foo 5 6)]
      bar)
;;[1 2 3 4 5 6]

(let [foo {:bloder 2 :daniel 12}
      bar (assoc foo :ronaldo 32)]
      bar)
;;{:ronaldo 32, :bloder 2, :daniel 12}
