(ns webapp.route
  (:require [webapp.handler :refer [handle-index
                                    handle-meetup
                                    handle-bourne]])
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found]]
            [ring.handler.dump :refer [handle-dump]]))

(defroutes routes
  (GET "/"                    [] handle-index)
  (GET "/meetup/:meetup-name" [] handle-meetup)
  (GET "/request"             [] handle-dump)
  (GET "/whoami"              [] handle-bourne)
  (not-found                     "Page not found."))
