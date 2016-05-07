(ns I-am-brave.destructuring)

(defn destructuring
  "Destructuring example"
  [[first & second]]
  (println "First param : " first )
  (println "Other params : " second))

(defn str-example
  "Str function example with destructuring"
  [[First Second & Losers]]
  (str "Winner - " First " Second - " Second " Losers - " Losers))

(str-example ["Daniel" "Bloder" "Troxa 1" "Troxa 2"])
;; "Winner - Daniel Second - Bloder Losers - "Troxa 1 Troxa 2"

(let [{:keys [bar]} {:foo 2 :bar 3}] bar)
;; 3
