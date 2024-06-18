// Copyright(C) 2024 skywalker<j.karlsson@retrocoder.se>
package se.retrocoder.number;

public class JvInt128 extends Number implements JvArithmeticOperations<JvInt128> {

    /**
     * @param other
     * @return
     */
    @Override
    public JvInt128 add(JvInt128 other) {
        return null;
    }

    /**
     * @param other
     * @return
     */
    @Override
    public JvInt128 subtract(JvInt128 other) {
        return null;
    }

    /**
     * @param other
     * @return
     */
    @Override
    public JvInt128 multiply(JvInt128 other) {
        return null;
    }

    /**
     * @param other
     * @return
     */
    @Override
    public JvInt128 divide(JvInt128 other) {
        return null;
    }

    /**
     * @param other
     * @return
     */
    @Override
    public JvInt128 mod(JvInt128 other) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public JvInt128 abs() {
        return null;
    }

    /**
     * @param exponent
     * @return
     */
    @Override
    public JvInt128 pow(JvInt128 exponent) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public JvInt128 sqrt() {
        return null;
    }

    /**
     * Returns the value of the specified number as an {@code int}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code int}.
     */
    @Override
    public int intValue() {
        return 0;
    }

    /**
     * Returns the value of the specified number as a {@code long}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code long}.
     */
    @Override
    public long longValue() {
        return 0;
    }

    /**
     * Returns the value of the specified number as a {@code float}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code float}.
     */
    @Override
    public float floatValue() {
        return 0;
    }

    /**
     * Returns the value of the specified number as a {@code double}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code double}.
     */
    @Override
    public double doubleValue() {
        return 0;
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

//import java.io.Serial;

//public class Integer128 extends Number implements ArithmeticOperations<Integer128> {
//    @Serial
//    private static final long serialVersionUID = 1L;
//
//    private final long high;
//    private final long low;
//
//    public Integer128(long high, long low) {
//        this.high = high;
//        this.low = low;
//    }
//
//    // Number implementation
//    /**
//     * Returns the value of the specified number as an {@code int}.
//     *
//     * @return the numeric value represented by this object after conversion
//     * to type {@code int}.
//     */
//    @Override
//    public int intValue() {
//        return 0;
//    }
//
//    /**
//     * Returns the value of the specified number as a {@code long}.
//     *
//     * @return the numeric value represented by this object after conversion
//     * to type {@code long}.
//     */
//    @Override
//    public long longValue() {
//        return 0;
//    }
//
//    /**
//     * Returns the value of the specified number as a {@code float}.
//     *
//     * @return the numeric value represented by this object after conversion
//     * to type {@code float}.
//     */
//    @Override
//    public float floatValue() {
//        return 0;
//    }
//
//    /**
//     * Returns the value of the specified number as a {@code double}.
//     *
//     * @return the numeric value represented by this object after conversion
//     * to type {@code double}.
//     */
//    @Override
//    public double doubleValue() {
//        return 0;
//    }
//
//    // ArithmeticOperations implementation
//    /**
//     * @param other
//     * @return
//     */
//    @Override
//    public Integer128 add(Integer128 other) {
//        long newHigh = high + other.high;
//        long newLow = low + other.low;
//        return new Integer128(newHigh, newLow);
//    }
//
//    /**
//     * @param other
//     * @return
//     */
//    @Override
//    public Integer128 subtract(Integer128 other) {
//        return null;
//    }
//
//    /**
//     * @param other
//     * @return
//     */
//    @Override
//    public Integer128 multiply(Integer128 other) {
//        return null;
//    }
//
//    /**
//     * @param other
//     * @return
//     */
//    @Override
//    public Integer128 divide(Integer128 other) {
//        return null;
//    }
//
//    /**
//     * @param other
//     * @return
//     */
//    @Override
//    public Integer128 mod(Integer128 other) {
//        return null;
//    }
//
//    /**
//     * @return
//     */
//    @Override
//    public Integer128 abs() {
//        return null;
//    }
//
//    /**
//     * @param exponent
//     * @return
//     */
//    @Override
//    public Integer128 pow(Integer128 exponent) {
//        return null;
//    }
//
//    /**
//     * @return
//     */
//    @Override
//    public Integer128 sqrt() {
//        return null;
//    }