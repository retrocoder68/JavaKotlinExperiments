 /* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.iterators;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class JvFullIteratorTest {

    @Test void testJvFullIterator() {
        JvFullIterator classUnderTest = new JvFullIterator(3);
        Iterator<Integer> it = classUnderTest.iterator();
        assertTrue(it.hasNext(), "should have next");
        assertEquals(0, it.next(), "should be 0");
        assertTrue(it.hasNext(), "should have next");
        assertEquals(1, it.next(), "should be 1");
        assertTrue(it.hasNext(), "should have next");
        assertEquals(2, it.next(), "should be 2");
        assertFalse(it.hasNext(), "should not have next");
    }

    @Test void testJvFullIteratorImmutability() {
        JvFullIterator classUnderTest = new JvFullIterator(3);
        Iterator<Integer> it = classUnderTest.iterator();
        assertTrue(it.hasNext(), "should have next");
        assertEquals(0, it.next(), "should be 0");
        assertThrows(UnsupportedOperationException.class, it::remove, "should throw UnsupportedOperationException");

        while (it.hasNext()) {
            it.next();
            assertThrows(UnsupportedOperationException.class, it::remove, "should throw UnsupportedOperationException");
        }

        for (Integer $ : classUnderTest) {
            assertThrows(UnsupportedOperationException.class, it::remove, "should throw UnsupportedOperationException");
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