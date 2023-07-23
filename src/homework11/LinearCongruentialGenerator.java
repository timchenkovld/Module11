package homework11;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    private final long a;
    private final long c;
    private final long m;
    private long seed;

    public LinearCongruentialGenerator(long seed) {
        this.a = 25214903917L;
        this.c = 11L;
        this.m = (long) Math.pow(2, 48);
        this.seed = seed;
    }

    public Stream<Long> generateRandomStream() {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
