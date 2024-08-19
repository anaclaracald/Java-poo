package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> stream1 = list.stream().map(x -> x*10);
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<Integer> stream2 = Stream.iterate(0, x->x+2);
        System.out.println(Arrays.toString(stream2.limit(10).toArray()));

        Stream<Long> stream3 = Stream.iterate(new long[]{0L, 1L}, p->new long[]{p[1], p[0]+p[1]}).map(p->p[0]);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));
    }
}