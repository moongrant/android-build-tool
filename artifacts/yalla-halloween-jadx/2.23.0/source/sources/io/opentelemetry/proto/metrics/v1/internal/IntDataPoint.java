package io.opentelemetry.proto.metrics.v1.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class IntDataPoint {
    static {
        ProtoFieldInfo.OooO00o(1, 10, "labels");
        ProtoFieldInfo.OooO00o(2, 17, "startTimeUnixNano");
        ProtoFieldInfo.OooO00o(3, 25, "timeUnixNano");
        ProtoFieldInfo.OooO00o(4, 33, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ProtoFieldInfo.OooO00o(5, 42, "exemplars");
    }
}
