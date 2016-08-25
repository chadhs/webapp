(ns webapp.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn -main
  ([]
   (-main 8000))
  ([port]
   (jetty/run-jetty
    handler
    {:port (Integer. port)})))
