(defproject resting_duckling "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [wit/duckling "0.4.23"]
                 [compojure "1.5.2"]
                 [ring/ring-defaults "0.2.1"]
                 [clj-json "0.5.3"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:init resting-duckling.handler/init
         :destroy resting-duckling.handler/destroy
         :handler resting-duckling.handler/app}  
  :target-path "target/%s"
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})

