// Copyright(C) 2024 skywalker<j.karlsson@retrocoder.se>
package se.retrocoder.number;

public interface JvArithmeticOperations<T extends Number> {
    T add(T other);
    T subtract(T other);
    T multiply(T other);
    T divide(T other);
    T mod(T other);
    T abs();
    T pow(T exponent);
    T sqrt();
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