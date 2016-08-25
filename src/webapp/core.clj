(ns webapp.core
  (:require [webapp.route :refer [routes]])
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]])
  (:gen-class))

(def app
  (-> routes))

(defn -main
  ([] (-main 8000))
  ([port] (jetty/run-jetty app {:port (Integer. port)})))

(defn -dev-main
  ([] (-dev-main 8000))
  ([port] (jetty/run-jetty (wrap-reload #'app) {:port (Integer. port)})))
