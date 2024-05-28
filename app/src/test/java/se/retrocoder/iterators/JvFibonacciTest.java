 /* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
 package se.retrocoder.iterators;

 import org.junit.jupiter.api.Test;

 import java.util.Iterator;
 import java.util.stream.IntStream;

 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.junit.jupiter.api.Assertions.assertTrue;

 public class JvFibonacciTest {

    @Test void testJvFibonacci() {
        JvFibonacci classUnderTest = new JvFibonacci();
        Iterator<Integer> it = classUnderTest.iterator();
        assertTrue(it.hasNext(), "should have next");
        assertEquals(1, it.next(), "should be 1");
        assertTrue(it.hasNext(), "should have next");
        assertEquals(1, it.next(), "should be 1");
        assertTrue(it.hasNext(), "should have next");
        assertEquals(2, it.next(), "should be 2");
    }

    @Test void testJvFibonacciIntSupplier() {
        JvFibonacci classUnderTest = new JvFibonacci();
        IntStream.generate(classUnderTest.asIntSupplier())
                .takeWhile(n -> n < 10)
                .forEach(n -> assertTrue(n > 0 && n < 10, "should be between 0 and 10"));
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
