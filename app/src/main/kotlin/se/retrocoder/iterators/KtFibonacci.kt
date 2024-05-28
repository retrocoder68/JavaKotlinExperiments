/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.iterators

import java.util.function.IntSupplier

class KtFibonacci : KtGenericIterator<Int>(
    object : KtSequence<Int> {
        private var n1: Int = 1;
        private var n2: Int = 1;
        private var i: Int = 0;

        /**
         * The fibonacci series always start from 1, thus no initialization is needed
         *
         * @param seed the seed value is not used
         */
        override fun init(seed: Int) {
            /* The fibonacci series always start from 1, thus no initialization is needed */
        }

        /**
         * Calculate the next fibonacci number
         */
        override fun update() {
            if (i++ >= 2) {
                val nextN = n1 + n2
                n2 = n1
                n1 = nextN
            }
        }

        /**
         * The fibonacci series can always be updated
         *
         * @return true
         */
        override fun canUpdate(): Boolean {
            return true
        }

        /**
         * Get the current fibonacci number
         *
         * @return the current fibonacci number
         */
        override fun value(): Int {
            return n1
        }
    }, 0) {

    fun asIntSupplier(): IntSupplier {
        return object : IntSupplier {
            val it: Iterator<Int> = iterator()

            override fun getAsInt(): Int {
                return it.next()
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