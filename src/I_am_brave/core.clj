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

(defn verify-function
  "If - Else example"
  [x]
  (if (> x 1)
   (destructuring ["Daniel" "Ronaldo" "Marcos"])
   (anonymous-function 1)))

(defn str-function
  "Str function example with destructuring"
  [[First Second & Losers]]
  (str "Winner - " First " Second - " Second " Losers - " Losers))

(defn -main
  [& args]
  (str-function ["Bloder" "Daniel" "Romario" "Ronaldo" "Ronaldinho"]))
