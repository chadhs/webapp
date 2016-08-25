(ns webapp.core
  (:require [webapp.route :refer [routes]])
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [ring.middleware.json :refer [wrap-json-response]])
  (:gen-class))

(def app
  (-> routes
      wrap-json-response))

(defn -main
  ([] (-main 8000))
  ([port] (jetty/run-jetty app {:port (Integer. port)})))

(defn -dev-main
  ([] (-dev-main 8000))
  ([port] (jetty/run-jetty (wrap-reload #'app) {:port (Integer. port)})))
