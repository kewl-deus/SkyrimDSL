package es.skyrim.alchemy.test

import es.sykrim.alchemy._
import es.sykrim.alchemy.model._
import es.sykrim.alchemy.syntax._
import es.sykrim.alchemy.syntax.effect._

object MyRecipes {

  effect("Anfälligkeit für Blitz") -

  create effect "Anfälligkeit für Blitz" does weaken

  negative effect "Anfälligkeit für Blitz"

  negative effect "Anfälligkeit für Blitz" -> "Macht anfällig für Schockangriffe"

  alias("test123") For ("Anfälligkeit für Blitz")

  create alias "test123" For "Anfälligkeit für Blitz"

}

