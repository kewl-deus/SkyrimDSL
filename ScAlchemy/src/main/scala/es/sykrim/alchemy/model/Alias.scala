package es.sykrim.alchemy.model

trait Aliasable[T] {

  self : T =>

  type AliasedType = T

}

class Alias[A <: Aliasable[A]](val name: String, val aliased: A) {

}
