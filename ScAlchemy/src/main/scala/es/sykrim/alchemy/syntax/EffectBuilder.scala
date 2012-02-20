package es.sykrim.alchemy.syntax

import es.sykrim.alchemy.model.{EffectTome, Effect}


case class effect(val name: String){

  def + = new Effect(name, "", true)
  def - = new Effect(name, "", false)

  def does(b: Boolean) = new Effect(name, "", b)
}

object effect {
  val fortify = true
  val weaken = false
}

trait EffectBuilder {

  protected def isPositiveBuilder: Boolean

  def effect(name: String): Effect = this.effect(name, "")

  def effect(nameDesc: (String, String)) = addToTome (new Effect(nameDesc._1, nameDesc._2, isPositiveBuilder))

  protected def addToTome(e: Effect) = { EffectTomeBuilder.addEffect(e); e }
}

object positive extends EffectBuilder {
  protected def isPositiveBuilder = true
}

object negative extends EffectBuilder {
  protected def isPositiveBuilder = false
}