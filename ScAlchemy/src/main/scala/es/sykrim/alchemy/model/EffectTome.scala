package es.sykrim.alchemy.model

import scala.None


class EffectTome {

  var effects: List[Effect] = List()

  var effectAliases: List[Alias[Effect]] = List()

  def addEffect(effect: Effect) {
    find(effect.name) match {
      case Some(e: Effect) => {
        //update current
        e.description = effect.description
        e.positive = effect.positive
      }
      case _ => effects = effect :: effects
    }
  }

  def registerAlias(alias: String, aliased: String): Option[Alias[Effect]] = {
    find(aliased) match {
      case Some(e: Effect) => {
        val effAlias = new Alias[Effect](alias, e)
        effectAliases = effAlias :: effectAliases;
        Some(effAlias)
      }
      case _ => None
    }
  }

  def find(name: String): Option[Effect] = effects.find(_.name == name)
}
