package es.sykrim.alchemy.syntax

import es.sykrim.alchemy.model.{EffectTome, Alias}


case class alias(val name: String){
  def For(aliased: String) = EffectTomeBuilder.registerAlias(name, aliased)
}