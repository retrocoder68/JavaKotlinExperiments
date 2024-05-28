/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.iterators

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KtFibonacciTest {

    @Test fun testKtFibonacci() {
        val classUnderTest = KtFibonacci()
        val expected = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
        val actual = classUnderTest.take(10).toList()
        assertEquals(expected, actual)
    }

    @Test fun testKtFibonacciAsIntSupplier() {
        val fibonacci = KtFibonacci()
        val expected = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
        val actual = (1..10).map { fibonacci.asIntSupplier().asInt }
        assertEquals(expected, actual)
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