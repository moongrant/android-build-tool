package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.StatusData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_SpanWrapper extends SpanWrapper {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f32927OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RecordEventsReadableSpan f32928OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<LinkData> f32929OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<EventData> f32930OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Attributes f32931OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f32932OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f32933OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final StatusData f32934OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f32935OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f32936OooOO0;

    public AutoValue_SpanWrapper(RecordEventsReadableSpan recordEventsReadableSpan, List<LinkData> list, List<EventData> list2, Attributes attributes, int i, int i2, StatusData statusData, String str, long j, boolean z) {
        if (recordEventsReadableSpan == null) {
            throw new NullPointerException("Null delegate");
        }
        this.f32928OooO00o = recordEventsReadableSpan;
        if (list == null) {
            throw new NullPointerException("Null resolvedLinks");
        }
        this.f32929OooO0O0 = list;
        if (list2 == null) {
            throw new NullPointerException("Null resolvedEvents");
        }
        this.f32930OooO0OO = list2;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f32931OooO0Oo = attributes;
        this.f32933OooO0o0 = i;
        this.f32932OooO0o = i2;
        if (statusData == null) {
            throw new NullPointerException("Null status");
        }
        this.f32934OooO0oO = statusData;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f32935OooO0oo = str;
        this.f32927OooO = j;
        this.f32936OooOO0 = z;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final RecordEventsReadableSpan OooOOO() {
        return this.f32928OooO00o;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final Attributes OooOOO0() {
        return this.f32931OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final long OooOOOO() {
        return this.f32927OooO;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final boolean OooOOOo() {
        return this.f32936OooOO0;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final List<EventData> OooOOo() {
        return this.f32930OooO0OO;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final String OooOOo0() {
        return this.f32935OooO0oo;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final List<LinkData> OooOOoo() {
        return this.f32929OooO0O0;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final int OooOo0() {
        return this.f32933OooO0o0;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final StatusData OooOo00() {
        return this.f32934OooO0oO;
    }

    @Override // io.opentelemetry.sdk.trace.SpanWrapper
    public final int OooOo0O() {
        return this.f32932OooO0o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpanWrapper)) {
            return false;
        }
        SpanWrapper spanWrapper = (SpanWrapper) obj;
        return this.f32928OooO00o.equals(spanWrapper.OooOOO()) && this.f32929OooO0O0.equals(spanWrapper.OooOOoo()) && this.f32930OooO0OO.equals(spanWrapper.OooOOo()) && this.f32931OooO0Oo.equals(spanWrapper.OooOOO0()) && this.f32933OooO0o0 == spanWrapper.OooOo0() && this.f32932OooO0o == spanWrapper.OooOo0O() && this.f32934OooO0oO.equals(spanWrapper.OooOo00()) && this.f32935OooO0oo.equals(spanWrapper.OooOOo0()) && this.f32927OooO == spanWrapper.OooOOOO() && this.f32936OooOO0 == spanWrapper.OooOOOo();
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((this.f32928OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f32929OooO0O0.hashCode()) * 1000003) ^ this.f32930OooO0OO.hashCode()) * 1000003) ^ this.f32931OooO0Oo.hashCode()) * 1000003) ^ this.f32933OooO0o0) * 1000003) ^ this.f32932OooO0o) * 1000003) ^ this.f32934OooO0oO.hashCode()) * 1000003) ^ this.f32935OooO0oo.hashCode()) * 1000003;
        long j = this.f32927OooO;
        return ((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ (this.f32936OooOO0 ? 1231 : 1237);
    }
}
