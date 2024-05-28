/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.iterators

class KtMutableIterator(private var n: Int) : MutableIterable<Int> {

    /**
     * Returns an iterator over elements of type `T`.
     *
     * @return an Iterator.
     */
    override fun iterator(): MutableIterator<Int> {
        return object : MutableIterator<Int> {
            private var i: Int = 0

            /**
             * Returns `true` if the iteration has more elements.
             * (In other words, returns `true` if `next` would
             * return an element rather than throwing an exception.)
             *
             * @return `true` if the iteration has more elements
             */
            override fun hasNext(): Boolean {
                return i < n
            }

            /**
             * Returns the next element in the iteration.
             *
             * @return the next element in the iteration
             * @throws NoSuchElementException if the iteration has no next element.
             */
            override fun next(): Int {
                if (!hasNext()) {
                    throw NoSuchElementException()
                }
                return i++
            }

            /**
             * Removes the last element returned by this iterator.
             */
            override fun remove() {
                if (hasNext()) {
                    next()
                }
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