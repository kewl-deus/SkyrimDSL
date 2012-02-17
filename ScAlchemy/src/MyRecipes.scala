import es.sykrim.alchemy._
import es.sykrim.alchemy.syntax.EffectBuilder._
import es.sykrim.alchemy.syntax.AliasBuilder._
import model.{Effect, Alias}

/*
effect "Anfälligkeit für Blitz" (-) : "Mach anfällig gegen Blitz"
*/
object MyRecipes {

  val ef1: Effect = effect("Anfälligkeit für Blitz") + "Mach anfällig gegen Blitz"

  //val a1: Alias = alias "test123" For "Anfälligkeit für Blitz"

  val a2: Alias = alias ("test123" For "Anfälligkeit für Blitz")

}
