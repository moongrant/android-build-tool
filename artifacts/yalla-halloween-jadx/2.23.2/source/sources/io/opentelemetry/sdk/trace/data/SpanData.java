package io.opentelemetry.sdk.trace.data;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.resources.Resource;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public interface SpanData {
    int OooO();

    Attributes OooO00o();

    SpanContext OooO0O0();

    int OooO0OO();

    long OooO0Oo();

    int OooO0o();

    InstrumentationLibraryInfo OooO0o0();

    long OooO0oO();

    List<LinkData> OooO0oo();

    Resource OooOO0();

    List<EventData> OooOO0O();

    SpanContext OooOO0o();

    SpanKind getKind();

    String getName();

    StatusData getStatus();
}
