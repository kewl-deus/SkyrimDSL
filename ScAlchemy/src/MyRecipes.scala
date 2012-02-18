import es.sykrim.alchemy._
import es.sykrim.alchemy.model._
import es.sykrim.alchemy.syntax._
import es.sykrim.alchemy.syntax.effect._

object MyRecipes {

  val ef1: Effect = effect("Anfälligkeit für Blitz") -
  
  val ef2: Effect = create effect "Anfälligkeit für Blitz" does weaken

  val ef3: Effect = negative effect "Anfälligkeit für Blitz"

  val ef4: Effect = negative effect "Anfälligkeit für Blitz" -> "Macht anfällig für Schockangriffe"

  val a1: Alias = alias ("test123") For ("Anfälligkeit für Blitz")

  val a2: Alias = create alias "test123" For "Anfälligkeit für Blitz"
}

object create{
  def alias(s: String) = new alias(s)
  def effect(s: String) = new effect(s)
}