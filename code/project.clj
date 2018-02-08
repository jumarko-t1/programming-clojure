;---
; Excerpted from "Programming Clojure, Third Edition",
; published by The Pragmatic Bookshelf.
; Copyrights apply to this code. It may not be used to create training material,
; courses, books, articles, and the like. Contact us if you are in doubt.
; We make no guarantees that this code is fit for any purpose.
; Visit http://www.pragmaticprogrammer.com/titles/shcloj3 for more book information.
;---
(defproject programming-clojure "1.9.0-16"
  :description "Examples from Programming Clojure"
  :aot [examples.tasklist]
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/test.check "0.9.0"]])
