(ns webapp.route
  (:require [webapp.handler :refer [handle-index
                                    handle-meetup]])
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found]]
            [ring.handler.dump :refer [handle-dump]]))

(defroutes routes
  (GET "/" [] handle-index)
  (GET "/clojure-mke" [] handle-meetup)
  (GET "/request" [] handle-dump)
  (not-found "Page not found."))
