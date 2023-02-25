package org.example;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FindMinMax {

    public static <T> void findMinMax(
            Supplier<Stream<? extends T>> stream,
            Comparator<? super T> comparator,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T min = stream.get().min(comparator).orElse(null);
        T max = stream.get().max(comparator).orElse(null);
        minMaxConsumer.accept(min, max);
    }

    static class NumberComparator implements Comparator<Number> {
        @Override
        public int compare(Number min, Number max) {
            return Double.compare(min.doubleValue(), max.doubleValue());
        }
    }
}
