/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.random;

/**
 * Configuration for a linear congruent generator.
 *
 * @param <T> Number type
 */
public interface JvLinearCongruentGeneratorConfig<T extends Number> {

    /**
     * Get the multiplier.
     *
     * @return Multiplier
     */
    T getMultiplier();

    /**
     * Get the increment.
     *
     * @return Increment
     */
    T getIncrement();

    /**
     * Get the modulus.
     *
     * @return Modulus
     */
    T getModulus();

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