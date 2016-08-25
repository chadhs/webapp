(ns webapp.route
  (:require [webapp.handler :refer [handle-index]])
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found]]))

(defroutes routes
  (GET "/" [] handle-index)
  (not-found "Page not found."))
