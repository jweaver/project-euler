(ns project-euler.core)
(use 'clojure.set)

(defn -main [& args])

(defn mults-3 "Get all the multiples of 3 below a given number"
  [num]
  (def results #{})
  (doseq [i (range num)]
    (if (= 0 (rem i 3))
      (def results (conj results i))))
  results)

(defn mults-5 "Get all the multiples of 5 below a given number"
  [num]
  (def results #{})
  (doseq [i (range num)]
    (if (= 0 (rem i 5))
      (def results (conj results i))))
  results)

(defn sum-all-multiples-of-3-and-5 "Solve the answer for Project-Euler problem #1."
  [number]
  (def multiples #{})
  (def multiples (union (mults-5 number) (mults-3 number)))
  (reduce + multiples))
