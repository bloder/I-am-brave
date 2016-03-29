(ns I-am-brave.core)

(defn destructuring
  "Destructuring example"
  [[first & second]]
  (println "First param : " first )
  (println "Other params : " second))

(def anonymous-function
  "Anonymous Function example"
  (fn [x] (*(+ x x)(* 10 5))))

(def other-anonymous-function
  "Other way to call anonymous function with params"
  (#(* % 2) 8))

(defn verify
  "If - Else example"
  [x]
  (if (> x 1)
   (destructuring ["Daniel" "Ronaldo" "Marcos"])
   (anonymous-function 1)))

(defn str-example
  "Str function example with destructuring"
  [[First Second & Losers]]
  (str "Winner - " First " Second - " Second " Losers - " Losers))

(defn sum-example-for-closure
  "Here's just a simple example to be called by a closure"
  [sum]
  #(+ % sum))

(def closure-function
  "Closure function example... I loved this *-----* "
  (sum-example-for-closure 5))

(defn -main
  [& args]
  (closure-function 10))
