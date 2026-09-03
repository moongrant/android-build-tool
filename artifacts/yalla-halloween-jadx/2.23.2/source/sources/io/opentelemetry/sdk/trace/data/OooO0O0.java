package io.opentelemetry.sdk.trace.data;

import io.opentelemetry.api.trace.StatusCode;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0O0 {
    public static StatusData OooO00o(StatusCode statusCode, @Nullable String str) {
        if (str == null) {
            str = "";
        }
        StatusData statusData = ImmutableStatusData.f33016OooO00o;
        if (str.isEmpty()) {
            int i = ImmutableStatusData.AnonymousClass1.f33019OooO00o[statusCode.ordinal()];
            if (i == 1) {
                return ImmutableStatusData.f33017OooO0O0;
            }
            if (i == 2) {
                return ImmutableStatusData.f33016OooO00o;
            }
            if (i == 3) {
                return ImmutableStatusData.f33018OooO0OO;
            }
        }
        return new AutoValue_ImmutableStatusData(statusCode, str);
    }

    public static StatusData OooO0O0() {
        return ImmutableStatusData.f33017OooO0O0;
    }
}
