package es.sykrim.alchemy.syntax

import es.sykrim.alchemy.model.Effect

case class effect(val name: String){

//  def isPositive = new Effect(name, "", true)
//  def isNegative = new Effect(name, "", false)

  def + = new Effect(name, "", true)
  def - = new Effect(name, "", false)

  def does(b: Boolean) = new Effect(name, "", b)
}

object effect {
  val fortify = true
  val weaken = false
}

object positive{
  def effect(name: String) = new Effect(name, "", true)
  def effect(nameDesc: (String, String)) = new Effect(nameDesc._1, nameDesc._2, true)
}

object negative{
  def effect(name: String) = new Effect(name, "", false)
  def effect(nameDesc: (String, String)) = new Effect(nameDesc._1, nameDesc._2, false)
}