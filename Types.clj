;;https://www.youtube.com/watch?v=BWcAn0Utdd0&list=PLtNErhYMkHnEqbduc9isON3nBHUULOSY6&index=4
(ns learnclojure)

(type 1)
(type (int 1))
(type 1.1)
(type true)
(type "Hello")

(type :a)
(type (keyword "a"))

(type (quote a))
(type 'a)

(type '(1 2 3))
(type (list 1 2 3))

(type (vector 1 2 3))

(nth (vector 1 2 3) 2)

(first (list 1 2 3))

{:a 1 :b 1 :c 1}
(:a {:a 1 :b 2})

(type #{1 2 3 4})