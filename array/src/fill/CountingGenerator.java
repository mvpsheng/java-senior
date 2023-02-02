package fill;

import util.Generator;

/**
 * FileName: CountingGenerator
 * author: gxs
 * Date: 2022/8/28  12:23
 */
public class CountingGenerator {
    public static class
    Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;
        public java.lang.Boolean next() {
            value = !value;
            return value;
        }
    }
    public static class
    Byte implements Generator<java.lang.Byte> {
        private byte value = 0;

        @Override
        public java.lang.Byte next() {
            return value++;
        }
    }

}
