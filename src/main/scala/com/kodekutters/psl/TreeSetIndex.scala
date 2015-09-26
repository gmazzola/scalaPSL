package com.kodekutters.psl

import scala.collection.immutable.TreeSet

/**
 * TreeSet based Rule index. Not used
 */
final class TreeSetIndex(val rules: List[Rule]) {

  private val treeSet = new TreeSet()(RuleComparator) ++ rules

  protected def findRules(domain: String): List[Rule] = rules.filter(_.doMatch(domain).isDefined)

  def getRules = treeSet.toList
}
