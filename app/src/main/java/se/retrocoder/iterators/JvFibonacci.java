/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.iterators;

import java.util.Iterator;
import java.util.function.IntSupplier;

public class JvFibonacci extends JvGenericIterator<Integer> {

    public JvFibonacci() {
        super(new JvSequence<Integer>() {
            private int n1 = 1;
            private int n2 = 1;
            private int i = 0;

            /**
             * The fibonacci series always start from 1, thus no initialization is needed
             *
             * @param $ the seed value is not used
             */
            @Override
            public void init(Integer $) {
                /* The fibonacci series always start from 1, thus no initialization is needed */
            }

            /**
             * Calculate the next fibonacci number
             */
            @Override
            public void update() {
                if (i++ >= 2) {
                    int nextN = n1 + n2;
                    n2 = n1;
                    n1 = nextN;
                }
            }

            /**
             * The fibonacci series can always be updated
             *
             * @return true
             */
            @Override
            public boolean canUpdate() {
                return true;
            }

            /**
             * Get the current fibonacci number
             *
             * @return the current fibonacci number
             */
            @Override
            public Integer value() {
                return n1;
            }
        }, 0);
    }

    public IntSupplier asIntSupplier() {
        return new IntSupplier() {
            private final Iterator<Integer> it = iterator();

            @Override
            public int getAsInt() {
                return it.next();
            }
        };
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