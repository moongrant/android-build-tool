package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.common.Attributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class DoubleHistogramPointData implements PointData {
    public static DoubleHistogramPointData OooO0o0(long j, long j2, Attributes attributes, double d, List list, ArrayList arrayList) {
        boolean z;
        List listEmptyList = Collections.emptyList();
        if (arrayList.size() != list.size() + 1) {
            throw new IllegalArgumentException("invalid counts: size should be " + (list.size() + 1) + " instead of " + arrayList.size());
        }
        int i = 0;
        while (true) {
            if (i >= list.size() - 1) {
                z = true;
                break;
            }
            Double d2 = (Double) list.get(i);
            i++;
            if (d2.compareTo((Double) list.get(i)) >= 0) {
                z = false;
                break;
            }
        }
        if (!z) {
            throw new IllegalArgumentException("invalid boundaries: " + list);
        }
        if (!list.isEmpty() && (((Double) list.get(0)).isInfinite() || ((Double) list.get(list.size() - 1)).isInfinite())) {
            throw new IllegalArgumentException("invalid boundaries: contains explicit +/-Inf");
        }
        Iterator it = arrayList.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Long) it.next()).longValue();
        }
        return new AutoValue_DoubleHistogramPointData(j, j2, attributes, listEmptyList, d, jLongValue, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(arrayList)));
    }

    public abstract double OooO();

    public abstract List<Double> OooO0o();

    public abstract long OooO0oO();

    public abstract List<Long> OooO0oo();
}
