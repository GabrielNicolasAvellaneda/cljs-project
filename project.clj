(defproject cljs-project "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]]
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "1.0.4"]]
  :cljsbuild {
              :builds [{
                :source-paths ["src/cljs"]
                :compiler {
                 :optimizations :whitespace
                 :output-to "resources/public/project.js"
                 :pretty-print true}}]})
