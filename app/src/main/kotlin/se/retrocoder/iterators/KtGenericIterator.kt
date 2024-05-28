/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.iterators

/**
 * A generic iterator that can be used to iterate over a sequence of values.
 *
 * @param T the type of the values in the sequence
 * @param seed the seed value used to initialize the state
 *
 * @property state the internal state of the sequence used to generate the values
 *
 * @constructor Creates an iterable object given a state object and a seed to initialize the state.
 */
open class KtGenericIterator<T>(private var state: KtSequence<T>, seed: T) : Iterable<T> {
    init {
        state.init(seed)
    }

    override fun iterator(): Iterator<T> {
        return object : Iterator<T> {
            /**
             * Returns 'true' if the iteration has more elements.
             * (In other words, returns 'true' if [next] would
             * return an element rather than throwing an exception.)
             *
             * @return 'true' if the iteration has more elements
             */
            override fun hasNext(): Boolean {
                return state.canUpdate()
            }

            /**
             * Returns the next element in the iteration.
             *
             * @return the next element in the iteration
             * @throws NoSuchElementException if the iteration has no more elements
             */
            override fun next(): T {
                if (!hasNext()) {
                    throw NoSuchElementException()
                }
                state.update()
                return state.value()
            }
        }
    }

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