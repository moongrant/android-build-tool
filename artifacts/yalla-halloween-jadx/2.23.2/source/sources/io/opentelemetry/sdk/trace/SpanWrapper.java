package io.opentelemetry.sdk.trace;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.data.StatusData;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
abstract class SpanWrapper implements SpanData {
    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final int OooO() {
        return OooOo0O();
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final Attributes OooO00o() {
        return OooOOO0();
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final SpanContext OooO0O0() {
        return OooOOO().f32948OooO0o0;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final int OooO0OO() {
        return OooOo0();
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final long OooO0Oo() {
        return OooOOO().f32954OooOOO;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final int OooO0o() {
        return OooOOO().f32945OooO;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final InstrumentationLibraryInfo OooO0o0() {
        return OooOOO().f32955OooOOO0;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final long OooO0oO() {
        return OooOOOO();
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final List<LinkData> OooO0oo() {
        return OooOOoo();
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final Resource OooOO0() {
        return OooOOO().f32953OooOO0o;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final List<EventData> OooOO0O() {
        return OooOOo();
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final SpanContext OooOO0o() {
        return OooOOO().f32947OooO0o;
    }

    public abstract RecordEventsReadableSpan OooOOO();

    public abstract Attributes OooOOO0();

    public abstract long OooOOOO();

    public abstract boolean OooOOOo();

    public abstract List<EventData> OooOOo();

    public abstract String OooOOo0();

    public abstract List<LinkData> OooOOoo();

    public abstract int OooOo0();

    public abstract StatusData OooOo00();

    public abstract int OooOo0O();

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final SpanKind getKind() {
        return OooOOO().f32951OooOO0;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final String getName() {
        return OooOOo0();
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public final StatusData getStatus() {
        return OooOo00();
    }

    public final String toString() {
        return "SpanData{spanContext=" + OooO0O0() + ", parentSpanContext=" + OooOO0o() + ", resource=" + OooOO0() + ", instrumentationLibraryInfo=" + OooO0o0() + ", name=" + OooOOo0() + ", kind=" + getKind() + ", startEpochNanos=" + OooO0Oo() + ", endEpochNanos=" + OooOOOO() + ", attributes=" + OooOOO0() + ", totalAttributeCount=" + OooOo0() + ", events=" + OooOOo() + ", totalRecordedEvents=" + OooOo0O() + ", links=" + OooOOoo() + ", totalRecordedLinks=" + OooO0o() + ", status=" + OooOo00() + ", hasEnded=" + OooOOOo() + "}";
    }
}
