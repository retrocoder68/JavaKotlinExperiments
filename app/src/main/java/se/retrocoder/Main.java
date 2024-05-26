/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder;

import se.retrocoder.iterators.JvBasicIterator;
import se.retrocoder.iterators.JvFullIterator;

import java.util.Iterator;

public class Main {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Main().getGreeting());

        // Test basic iterator
        System.out.println("Test JvBasicIterator with for loop");
        for (Iterator<Integer> it = new JvBasicIterator(3).iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        System.out.println("Test JvBasicIterator with while loop");
        Iterator<Integer> it = new JvBasicIterator(3).iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Test full iterator
        System.out.println("Test JvFullIterator");
        for (Integer i : new JvFullIterator(3)) {
            System.out.println(i);
        }

        System.out.println(new KtMain().getGreetings());
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