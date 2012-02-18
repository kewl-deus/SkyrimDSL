package es.sykrim.alchemy.syntax

import es.sykrim.alchemy.model.Alias


case class alias(val name: String){
  def For(aliased: String) = new Alias(name, aliased)
}