(ns cljwallet.core
  (:require [clojure.data.json :as json]
            [org.httpkit.client :as http])
  (:import  (org.bitcoinj.params MainNetParams)))

;(defn -main [& args]
;  (def addressInfo @(http/get "https://api.blockcypher.com/v1/btc/main/addrs/1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2"))
;  (let [{a :body} addressInfo]
;    (print a)))

(defn -main [& args]
  (def params (. MainNetParams get))
  (println params)
  (def filePrefix "forwarding-service"))
