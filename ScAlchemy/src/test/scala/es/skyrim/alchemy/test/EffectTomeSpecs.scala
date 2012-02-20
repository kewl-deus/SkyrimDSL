package es.skyrim.alchemy.test

import org.specs._
import es.sykrim.alchemy.syntax.effect._
import es.sykrim.alchemy.syntax.alias._
import es.sykrim.alchemy.syntax._
import es.sykrim.alchemy.model.Effect


class EffectTomeSpecs extends Specification {

  "invoking negative effect" should {
    "create a negative effect" in {

      //negative effect "Anfälligkeit für Blitz" mustEq new Effect("Anfälligkeit für Blitz", "", false)

      negative effect "Anfälligkeit für Blitz" -> "Macht anfällig für Schockangriffe" mustEq new Effect("Anfälligkeit für Blitz", "Macht anfällig für Schockangriffe", false)

    }
  }

}
