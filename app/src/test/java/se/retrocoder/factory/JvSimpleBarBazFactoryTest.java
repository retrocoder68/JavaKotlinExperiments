/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JvSimpleBarBazFactoryTest {

    @Test void testJvSimpleBarBazFactory() {
        JvSimpleBarBazFactory classUnderTest = new JvSimpleBarBazFactory();
        JvWhoAmI bar = classUnderTest.create(JvSimpleBarBazFactory.Type.BAR);
        assertEquals("I am Bar", bar.whoAmI(), "should be Bar");

        JvWhoAmI baz = classUnderTest.create(JvSimpleBarBazFactory.Type.BAZ);
        assertEquals("I am Baz", baz.whoAmI(), "should be Baz");
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