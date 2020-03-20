(ns loja.core)


(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (funcao primeiro)
    (meu-mapa funcao (rest sequencia))))

;(meu-mapa println ["daniela", "gabriel", "rafael"])

; StackOverFlowError
;(defn meu-mapa
;  [funcao sequencia]
;  (let [primeiro (first sequencia)]
;    (if (not (nil? primeiro))
;      (do
;        (funcao primeiro)
;        (meu-mapa funcao (rest sequencia))))))

; RECURSIVE - not error StackOverFlow
; O recur deve ser o ultimo a ser chamado na funcao
; Usado para chamar a funcao dentro dela mesma
; O recur gerencia a pilha de execucao para nao estourar
(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if (not (nil? primeiro))
      (do
        (funcao primeiro)
        (recur funcao (rest sequencia))))))

; return first element
; (first [1 2 3])

; executing block code IF
; (do func [])

; (rest []) return rest of element after first element

(meu-mapa println ["Daniela", "Matheus", "Geovana", false, true, 1, 2])
(meu-mapa println (range 10000))