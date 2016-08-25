(ns webapp.handler)

(defn handle-index [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})
