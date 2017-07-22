;;https://www.youtube.com/watch?v=NrvQZ7r-pn8&index=5&list=PLtNErhYMkHnEqbduc9isON3nBHUULOSY6
(ns learnclojure)

(def x "Hello Clojure")

(let [x "Steve"]
  (print "Hello, " x))
;;(str x)

;;if statement
(def y "Hello")

(if (empty? x)
  "X is empty"
  "X is not empty")
