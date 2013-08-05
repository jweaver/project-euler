(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]))

(deftest a-test
  (testing "Basic clojure lein test.  Should always PASS."
    (println "TEST - PROJECT - Clojure/lein:  Clojure/lein test, which should always pass.")
    (is (= 1 1))))
