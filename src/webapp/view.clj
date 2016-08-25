(ns webapp.view
  (:require [hiccup.page :refer [html5]]))

(defn meetup-page [meetup-name]
  (html5
   {:lang :en}
   [:head
    [:title meetup-name]
    [:meta {:name :viewport
            :content "width=device-width, initial-scale=1.0"}]]
   [:body
    [:div.container
     [:h1 meetup-name]
     [:p "Hello " meetup-name ". What a good looking crowd!"]]]))
