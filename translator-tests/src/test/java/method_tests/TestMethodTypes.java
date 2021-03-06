/*
 * Copyright (c) 2012-2015, Microsoft Mobile
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package method_tests;

public class TestMethodTypes {
    /**
     * Test the different access types
     */
    public void publicAccess() {
    }

    protected void protectedAccess() {
    }

    void packageAccess() {
    }

    private void privateAccess() {
    }

    private void paramPrimitiveTypes(byte byteParam, short shortParam, int intParam, long longParam, float floatParam,
                                     double doubleParam, char charParam, boolean booleanParam, String stringParam) {
    }

    private void paramPrimitiveArrayTypes(byte[] byteParam, short[] shortParam, int[] intParam, long[] longParam, float[] floatParam,
                                          double[] doubleParam, char[] charParam, boolean[] booleanParam, String[] stringParam) {
    }

/*
    private void paramPrimitiveMultiArrayTypes(byte[][] byteParam, short[][] shortParam, int[][] intParam, long[][] longParam, float[][] floatParam,
                                               double[][] doubleParam, char[][] charParam, boolean[][] booleanParam, String[][] stringParam) {
    }
*/

    private void varargs(byte... bytes) {
    }

    private void varargs(int intParam, String... strings) {
    }

    public static abstract class Super {
        abstract Object foo(Integer p1);
    }

    public static class Sub extends Super {
        @Override
        Double foo(Integer p1) {
            return null;
        }
    }
}
