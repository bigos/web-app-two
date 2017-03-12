(ns user
  (:require [mount.core :as mount]
            web-app-two.core))

(defn start []
  (mount/start-without #'web-app-two.core/http-server
                       #'web-app-two.core/repl-server))

(defn stop []
  (mount/stop-except #'web-app-two.core/http-server
                     #'web-app-two.core/repl-server))

(defn restart []
  (stop)
  (start))


