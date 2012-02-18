package es.sykrim.alchemy.model

trait Aliasable[T] {

  self : T =>

  type AliasedType = T

}

class Alias(val name: String, val aliased: String) {

}
