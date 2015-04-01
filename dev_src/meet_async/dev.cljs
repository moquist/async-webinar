(ns meet-async.dev
    (:require
     [meet-async.core]
     [figwheel.client :as fw]))

(fw/start {
  :websocket-url "ws://localhost:3449/figwheel-ws"
  :on-jsload (fn []
               (js/window.location.reload)
               (println "Cynically reloading the page because this code is not actually figwheel-safe. See https://github.com/bhauman/lein-figwheel#writing-reloadable-code if you care.")
               )})
