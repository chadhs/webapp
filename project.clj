(defproject webapp "0.1.0-SNAPSHOT"
  :description "sample webapp for clojure-mke"
  :url "http://example.com/webapp"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.5.0"]
                 [ring/ring-jetty-adapter "1.5.0"]]

  :min-lein-version "2.0.0"
  :uberjar-name "webapp.jar"
  :profiles {:uberjar {:aot :all}}
  :main webapp.core)
