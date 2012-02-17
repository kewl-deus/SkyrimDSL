package es.sykrim.alchemy.syntax

import es.sykrim.alchemy.model.Effect

class EffectBuilder(var name: String) {

  protected var description: String = ""
  protected var positive: Boolean = true

  def + = { this.positive = true; this }

  def - = { this.positive = false; this }

  def + (description: String) = { this.positive = true; this.description = description; this }

  def - (description: String) = {  this.positive = false; this.description = description; this }

}

object EffectBuilder {
  def effect(name:String) = new EffectBuilder(name)

  implicit def builderToEffect(eb: EffectBuilder) = new Effect(eb.name, eb.description, eb.positive)
}
