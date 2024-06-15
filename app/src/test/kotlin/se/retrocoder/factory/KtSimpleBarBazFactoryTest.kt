/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.factory

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

class KtSimpleBarBazFactoryTest {

    @Test fun testCreateBar() {
        val classUnderTest = KtSimpleBarBazFactory()
        val bar: KtWhoAmI = classUnderTest.create(KtSimpleBarBazFactory.Type.BAR)
        assertEquals("I am Bar", bar.whoAmI(), "should be Bar")

        var baz: KtWhoAmI = classUnderTest.create(KtSimpleBarBazFactory.Type.BAZ)
        assertEquals("I am Baz", baz.whoAmI(), "should be Baz")
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