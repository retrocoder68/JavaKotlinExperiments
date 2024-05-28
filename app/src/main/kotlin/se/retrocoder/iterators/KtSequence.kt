/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.iterators

/**
 * A sequence is a series of values that can be updated to produce the next value in the series.
 *
 * @param <T> the type of the values in the sequence
 */
interface KtSequence<T> {

    /**
     * Initialize the state of the sequence with the given seed.
     *
     * @param seed the seed value
     */
    fun init(seed: T)

    /**
     * Update the state of the sequence.
     */
    fun update();

    /**
     * Check if the sequence can be updated.
     *
     * @return true if the sequence can be updated
     */
    fun canUpdate(): Boolean

    /**
     * Get the current value of the sequence.
     *
     * @return the current value
     */
    fun value(): T

}

/* License
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */