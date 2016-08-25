(ns webapp.handler
  (:require [ring.util.response :refer [response]]))

(defn handle-index [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn handle-meetup [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello Clojure MKE. What a good looking crowd!"})

(defn handle-bourne [request]
  (response {:name "Json Bourne" :status "Deadly"}))
