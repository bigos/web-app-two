(ns web-app-two.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [web-app-two.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[web-app-two started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[web-app-two has shut down successfully]=-"))
   :middleware wrap-dev})
