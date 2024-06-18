/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.number

class KtComplex(private var real: Double, private var imaginary: Double) {

    var magnitude: Double
    var argument: Double

    init {
        argument = Math.atan2(imaginary, real)
        magnitude = Math.sqrt(real * real + imaginary * imaginary)
    }

    //constructor(magnitude: Double, argument: Double) : this(magnitude * Math.cos(argument), magnitude * Math.sin(argument)

    fun add(c: KtComplex): KtComplex {
        return KtComplex(real + c.real, imaginary + c.imaginary)
    }

    fun subtract(c: KtComplex): KtComplex {
        return KtComplex(real - c.real, imaginary - c.imaginary)
    }

    fun multiply(c: KtComplex): KtComplex {
        return KtComplex(real * c.real - imaginary * c.imaginary, real * c.imaginary + imaginary * c.real)
    }

    fun divide(c: KtComplex): KtComplex {
        val denominator = c.real * c.real + c.imaginary * c.imaginary
        return KtComplex((real * c.real + imaginary * c.imaginary) / denominator, (imaginary * c.real - real * c.imaginary) / denominator)
    }

    fun abs(): Double {
        return Math.sqrt(real * real + imaginary * imaginary)
    }

    fun conjugate(): KtComplex {
        return KtComplex(real, -imaginary)
    }

    fun reciprocal(): KtComplex {
        val denominator = real * real + imaginary * imaginary
        return KtComplex(real / denominator, -imaginary / denominator)
    }

    fun exp(): KtComplex {
        return KtComplex(Math.exp(real) * Math.cos(imaginary), Math.exp(real) * Math.sin(imaginary))
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