package es.sykrim.alchemy.syntax

import es.sykrim.alchemy.model.Alias


class AliasBuilder(val name: String) {

  def For(aliased: String) = new Alias(name, aliased)

}

object AliasBuilder {

  def alias(a: Alias) = a

  implicit def stringToAliasBuilder(s: String) = new AliasBuilder(s)

}