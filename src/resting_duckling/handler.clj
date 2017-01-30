(ns resting-duckling.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [duckling.core :as duck]
            [clj-json.core :as json]))

(defroutes app-routes
  (GET "/" [] "The duckling is resting & ready!")
  
  (GET "/en/time/:input"            [input]  (json/generate-string (duck/parse :en$core input [:time])))
  (GET "/en/temperature/:input"     [input]  (json/generate-string (duck/parse :en$core input [:temperature])))
  (GET "/en/number/:input"          [input]  (json/generate-string (duck/parse :en$core input [:number])))
  (GET "/en/ordinal/:input"         [input]  (json/generate-string (duck/parse :en$core input [:ordinal])))
  (GET "/en/distance/:input"        [input]  (json/generate-string (duck/parse :en$core input [:distance])))
  (GET "/en/volume/:input"          [input]  (json/generate-string (duck/parse :en$core input [:volume])))
  (GET "/en/amount_of_money/:input" [input]  (json/generate-string (duck/parse :en$core input [:amount-of-money])))
  (GET "/en/duration/:input"        [input]  (json/generate-string (duck/parse :en$core input [:duration])))
  (GET "/en/email/:input"           [input]  (json/generate-string (duck/parse :en$core input [:email])))
  (GET "/en/url/:input"             [input]  (json/generate-string (duck/parse :en$core input [:url])))
  (GET "/en/phone_number/:input"    [input]  (json/generate-string (duck/parse :en$core input [:phone-number])))

  ;; see https://duckling.wit.ai/ for more languages

  (route/not-found "Not Found"))
 
(def app
  (wrap-defaults app-routes site-defaults))
  
  
(defn init []
  (duck/load!))
  
(defn destroy []
     (println "resting-duckling is shutting down"))