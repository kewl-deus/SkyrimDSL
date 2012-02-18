package es.sykrim.alchemy.model

case class Effect(val name: String, val description: String, val positive: Boolean)
  extends Aliasable[Effect] {

}


