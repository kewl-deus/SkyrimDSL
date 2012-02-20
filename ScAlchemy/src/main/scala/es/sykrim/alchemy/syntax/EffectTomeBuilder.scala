package es.sykrim.alchemy.syntax

import es.sykrim.alchemy.model.{Alias, Effect, EffectTome}


object EffectTomeBuilder {

  var tome: EffectTome = new EffectTome

  def addEffect = tome.addEffect _

  def registerAlias = tome.registerAlias _
}
