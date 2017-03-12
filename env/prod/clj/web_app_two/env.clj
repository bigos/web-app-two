(ns web-app-two.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[web-app-two started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[web-app-two has shut down successfully]=-"))
   :middleware identity})
