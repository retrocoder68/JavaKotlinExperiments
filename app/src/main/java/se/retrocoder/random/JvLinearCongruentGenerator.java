/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.random;

public class JvLinearCongruentGenerator<T extends Number> {

    private Number state;
    private final JvLinearCongruentGeneratorConfig<T> config;

    JvLinearCongruentGenerator(T seed, JvLinearCongruentGeneratorConfig<T> config) {
        this.state = seed;
        this.config = config;
    }

    public T next() throws IllegalStateException {
        try {
            int stateType = state instanceof Double ? 0 : state instanceof Float ? 1 : state instanceof Long ? 2 : state instanceof Integer ? 3 : -1;
            state = switch (stateType) {
                case 0 -> ((Double) config.getMultiplier() * (Double) state + (Double) config.getIncrement()) % (Double) config.getModulus();
                case 1 -> ((Float) config.getMultiplier() * (Float) state + (Float) config.getIncrement()) % (Float) config.getModulus();
                case 2 -> ((Long) config.getMultiplier() * (Long) state + (Long) config.getIncrement()) % (Long) config.getModulus();
                case 3 -> ((Integer) config.getMultiplier() * (Integer) state + (Integer)config.getIncrement()) % (Integer)config.getModulus();
                default -> throw new IllegalStateException("Illegal type used: " + state);
            };

            return (T) state;

        } catch (ClassCastException e) {
            throw new IllegalStateException("Illegal type used: " + state);
        }
    }

    public void reseed(T seed) {
        state = seed;
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