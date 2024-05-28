/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder;

import se.retrocoder.iterators.*;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Main {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // Test java main
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

        // Test fibonacci iterator
        System.out.println("Test JvFibonacci");
        var jvFibonacci = new JvFibonacci().iterator();
        for (int i = 0; i < 5; i++) {
            System.out.println(jvFibonacci.next());
        }

        // Test stream with fibonacci IntSupplier
        System.out.println("Test stream with JvFibonacci IntSupplier");
        IntStream.generate(new JvFibonacci().asIntSupplier())
            .takeWhile(n -> n < 10)
            .forEach(System.out::println);

        // Test kotlin main
        System.out.println(new KtMain().getGreetings());

        // Test kotlin basic iterator
        System.out.println("Test KtBasicIterator with for loop");
        for (Iterator<Integer> it2 = new KtBasicIterator(3).iterator(); it2.hasNext(); ) {
            System.out.println(it2.next());
        }

        System.out.println("Test KtBasicIterator with while loop");
        Iterator<Integer> it2 = new KtBasicIterator(3).iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // Test kotlin full iterator
        System.out.println("Test KtFullIterator");
        for (Integer i : new KtFullIterator(3)) {
            System.out.println(i);
        }

        // Test kotlin fibonacci iterator
        System.out.println("Test KtFibonacci");
        var ktFibonacci = new KtFibonacci().iterator();
        for (int i = 0; i < 5; i++) {
            System.out.println(ktFibonacci.next());
        }

        // Test stream with kotlin fibonacci IntSupplier
        System.out.println("Test stream with KtFibonacci IntSupplier");
        IntStream.generate(new KtFibonacci().asIntSupplier())
            .takeWhile(n -> n < 10)
            .forEach(System.out::println);
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
