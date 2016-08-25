(ns webapp.handler
  (:require [webapp.view :refer [meetup-page]])
  (:require [ring.util.response :refer [response]]))

(defn handle-index [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn handle-meetup [request]
  (let [meetup-name (get-in request [:route-params :meetup-name])]
    {:status 200
     :headers {}
     :body (meetup-page meetup-name)}))

(defn handle-bourne [request]
  (response {:name "Json Bourne" :status "Deadly"}))
