(ns too-hot.core)

(defn celsius
  "Converts a temperature in Fahrenheit to Celsius."
  [f]
  (* (- f 32) 5/9))
 
(defn fahrenheit
  "Converts a temperature in Celsius to Fahrenheit."
  [c]
  (+ (* c 9/5) 32))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
