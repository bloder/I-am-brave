(ns I-am-brave.loop)

(defn other-boring-sum-function
  "let's try to play with loop =D"
  [x]
  (loop [count 0]
    (println (+ x x))
    (if(> count 3)
    (println "Ok i don't want to sum it anymore, idiot")
    (recur (inc count)))))
