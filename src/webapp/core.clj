(ns webapp.core
  (:require [webapp.route :refer [routes]])
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(def app
  (-> routes))

(defn -main
  ([] (-main 8000))
  ([port] (jetty/run-jetty app {:port (Integer. port)})))
