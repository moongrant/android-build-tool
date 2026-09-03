package io.opentelemetry.compat;

import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public class ComparatorsCompat {

    public enum NaturalOrderComparator implements Comparator<Comparable<Object>> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
            return comparable.compareTo(comparable2);
        }

        @Override // java.util.Comparator
        public final Comparator<Comparable<Object>> reversed() {
            return Collections.reverseOrder();
        }
    }
}
