(ns openscad-hello-world.core
  (:require [scad-clj.scad :as scad]
            [scad-clj.model :as model]
            ))

(def primitives
  (model/union
    (model/cube 100 100 100)
    (model/sphere 70)
    (model/cylinder 10 150)))

(spit "hello-world.scad"
  (scad/write-scad primitives))
