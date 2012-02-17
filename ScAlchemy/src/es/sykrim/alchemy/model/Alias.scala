package es.sykrim.alchemy.model

trait Aliasable[T] {

  def aliasedType: T

}

class Alias(val name: String, val aliased: String) {

}
