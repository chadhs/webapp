(ns webapp.handler)

(defn handle-index [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn handle-meetup [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello Clojure MKE. What a good looking crowd!"})
