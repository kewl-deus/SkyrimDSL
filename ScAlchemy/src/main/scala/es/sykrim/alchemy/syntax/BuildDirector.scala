package es.sykrim.alchemy.syntax

object create {
  def alias(s: String) = new alias(s)

  def effect(s: String) = new effect(s)
}