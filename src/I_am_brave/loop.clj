(ns I-am-brave.loop)

(defn other-boring-sum-function
  "let's try to play with loop =D"
  [x]
  (loop [count 0]
    (println (+ x x))
    (if(> count 3)
    (println "Ok i don't want to sum it anymore, idiot")
    (recur (inc count)))))

(defn recur-this-shit
  "Sum all values from a vec"
   ([foo] (recur-this-shit foo 0))
   ([foo bar]
     (if (empty? foo)
         bar
     (recur-this-shit (rest foo) (+ (first foo) bar)))))

(recur-this-shit [50 5 1])
;; 56
