(ns loja.aula2)

;["Daniela", "Matheus", "Geovana", "Guilherme", "Joao", "Rafael"]

;(defn conta
;  [total-ate-agora elementos]
;  (if (next elementos)
;    (recur (inc total-ate-agora) (next elementos))
;    total-ate-agora))
;
;(println (conta 0 ["Daniela", "Matheus", "Geovana", "Guilherme", "Joao", "Rafael"]))


; Variacoes de chamada de funcao
; (param1, param2) ou (param1)
(defn minha-funcao
  ([param1] (println "p1" param1))
  ([param1 param2] (println "p2" param1 param2)))

(minha-funcao 1)
(minha-funcao 1 2)

(defn conta
                           ([elementos]
                            (conta 0 elementos))

                           ([total-ate-agora elementos]
                            (if (seq elementos)
                              (recur (inc total-ate-agora) (next elementos))
                              total-ate-agora)))

(println (conta 0 ["Daniela", "Matheus", "Geovana", "Guilherme", "Joao", "Rafael"]))
(println (conta  ["Daniela", "Matheus", "Geovana", "Guilherme", "Joao", "Rafael"]))



(defn conta
  [elementos]
  (loop [total-ate-agora 0
         elementos-restantes elementos]
    (if (seq elementos-restantes)
      (recur (inc total-ate-agora) (next elementos-restantes))
      total-ate-agora
      )
    ))


(println (conta ["Daniela", "Matheus", "Geovana", "Guilherme", "Joao", "Rafael"]))
(println (conta  []))



