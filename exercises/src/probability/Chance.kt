/*
 * Copyright (c) 2020 by Fred George
 * May be used freely except for training; license required for training.
 * @author Fred George  fredgeorge@acm.org
 */

package probability

// Understands the likelihood of something specific occurring
class Chance(likelihoodAsFraction: Number) {
    private val fraction = likelihoodAsFraction.toDouble()

    override fun equals(other: Any?) = other is Chance && this.equals(other)

    private fun equals(other: Chance) = this.fraction == other.fraction

    override fun hashCode() = fraction.hashCode()
}