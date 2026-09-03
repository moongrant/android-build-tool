package io.opentelemetry.proto.metrics.v1.internal;

import io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class HistogramDataPoint {
    static {
        ProtoFieldInfo.OooO00o(9, 74, "attributes");
        ProtoFieldInfo.OooO00o(1, 10, "labels");
        ProtoFieldInfo.OooO00o(2, 17, "startTimeUnixNano");
        ProtoFieldInfo.OooO00o(3, 25, "timeUnixNano");
        ProtoFieldInfo.OooO00o(4, 33, "count");
        ProtoFieldInfo.OooO00o(5, 41, "sum");
        ProtoFieldInfo.OooO00o(6, 50, "bucketCounts");
        ProtoFieldInfo.OooO00o(7, 58, "explicitBounds");
        ProtoFieldInfo.OooO00o(8, 66, "exemplars");
    }
}
