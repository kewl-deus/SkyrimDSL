package es.sykrim.alchemy.model

case class Effect(val name: String, var description: String, var positive: Boolean)
  extends Aliasable[Effect] {

}


