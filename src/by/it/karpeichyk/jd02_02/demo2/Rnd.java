package by.it.karpeichyk.jd02_02.demo2;

import java.util.Random;

class Rnd {
    private static final long init=System.currentTimeMillis();
    private static final Random random = new Random(init);

    static int fromTo(int from, int to) {
        /* вычислим время ожидания */
        int delta=to-from+1;
        return from+random.nextInt(delta);
    }
}
