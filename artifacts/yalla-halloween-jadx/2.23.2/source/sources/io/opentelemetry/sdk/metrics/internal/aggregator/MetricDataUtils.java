package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.metrics.data.DoublePointData;
import io.opentelemetry.sdk.metrics.data.LongPointData;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class MetricDataUtils {
    private MetricDataUtils() {
    }

    public static ArrayList OooO00o(Map map, long j, long j2) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(DoublePointData.OooO0OO(j, j2, (Attributes) entry.getKey(), ((Double) entry.getValue()).doubleValue()));
        }
        return arrayList;
    }

    public static ArrayList OooO0O0(Map map, long j, long j2) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(LongPointData.OooO0OO(j, j2, (Attributes) entry.getKey(), ((Long) entry.getValue()).longValue()));
        }
        return arrayList;
    }
}
