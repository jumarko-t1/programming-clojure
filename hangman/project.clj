(defproject hangman "0.1.0-SNAPSHOT"
  :description "Hangman game implementation from Programing Clojure - chapter 11."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main ^:skip-aot hangman.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
