package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.common.OooO;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.data.StatusData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class RecordEventsReadableSpan implements ReadWriteSpan {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final Logger f33477OooOo0O = Logger.getLogger(RecordEventsReadableSpan.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SpanLimits f33479OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SpanContext f33480OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SpanContext f33481OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SpanProcessor f33482OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<LinkData> f33483OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final SpanKind f33484OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AnchoredClock f33485OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Resource f33486OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f33487OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final InstrumentationLibraryInfo f33488OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final String f33490OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public AttributesMap f33492OooOOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f33495OooOo00;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Object f33489OooOOOO = new Object();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public StatusData f33493OooOOoo = io.opentelemetry.sdk.trace.data.OooO00o.OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f33478OooO = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f33494OooOo0 = false;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList f33491OooOOo = new ArrayList();

    public RecordEventsReadableSpan(SpanContext spanContext, String str, InstrumentationLibraryInfo instrumentationLibraryInfo, SpanKind spanKind, SpanContext spanContext2, SpanLimits spanLimits, SpanProcessor spanProcessor, AnchoredClock anchoredClock, Resource resource, @Nullable AttributesMap attributesMap, List list, long j) {
        this.f33481OooO0o0 = spanContext;
        this.f33488OooOOO0 = instrumentationLibraryInfo;
        this.f33480OooO0o = spanContext2;
        this.f33483OooO0oo = list;
        this.f33490OooOOOo = str;
        this.f33484OooOO0 = spanKind;
        this.f33482OooO0oO = spanProcessor;
        this.f33486OooOO0o = resource;
        this.f33485OooOO0O = anchoredClock;
        this.f33487OooOOO = j;
        this.f33492OooOOo0 = attributesMap;
        this.f33479OooO0Oo = spanLimits;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO(StatusCode statusCode, @Nullable String str) {
        if (statusCode != null) {
            synchronized (this.f33489OooOOOO) {
                if (this.f33494OooOo0) {
                    f33477OooOo0O.log(Level.FINE, "Calling setStatus() on an ended Span.");
                } else {
                    this.f33493OooOOoo = io.opentelemetry.sdk.trace.data.OooO00o.OooO00o(statusCode, str);
                }
            }
        }
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public final SpanData OooO00o() {
        List listUnmodifiableList;
        Attributes attributesOooO0O0;
        AutoValue_SpanWrapper autoValue_SpanWrapper;
        synchronized (this.f33489OooOOOO) {
            List<LinkData> list = this.f33483OooO0oo;
            ArrayList arrayList = this.f33491OooOOo;
            if (arrayList.isEmpty()) {
                listUnmodifiableList = Collections.emptyList();
            } else {
                listUnmodifiableList = this.f33494OooOo0 ? Collections.unmodifiableList(arrayList) : Collections.unmodifiableList(new ArrayList(arrayList));
            }
            List list2 = listUnmodifiableList;
            AttributesMap attributesMap = this.f33492OooOOo0;
            if (attributesMap == null || attributesMap.isEmpty()) {
                attributesOooO0O0 = OooO.OooO0O0();
            } else if (this.f33494OooOo0) {
                attributesOooO0O0 = this.f33492OooOOo0;
            } else {
                AttributesMap attributesMap2 = this.f33492OooOOo0;
                attributesMap2.getClass();
                AttributesBuilder attributesBuilderOooO00o = OooO.OooO00o();
                attributesBuilderOooO00o.OooO0O0(attributesMap2);
                attributesOooO0O0 = attributesBuilderOooO00o.build();
            }
            Attributes attributes = attributesOooO0O0;
            AttributesMap attributesMap3 = this.f33492OooOOo0;
            autoValue_SpanWrapper = new AutoValue_SpanWrapper(this, list, list2, attributes, attributesMap3 == null ? 0 : attributesMap3.f33452OooO0o, OooO0Oo(), this.f33490OooOOOo, this.f33495OooOo00, this.f33494OooOo0);
        }
        return autoValue_SpanWrapper;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final SpanContext OooO0O0() {
        return this.f33481OooO0o0;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO0OO(InternalAttributeKeyImpl internalAttributeKeyImpl, int i) {
        OooO0oo(internalAttributeKeyImpl, Long.valueOf(i));
        return this;
    }

    public final StatusData OooO0Oo() {
        StatusData statusData;
        synchronized (this.f33489OooOOOO) {
            statusData = this.f33493OooOOoo;
        }
        return statusData;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final void OooO0o() {
        AnchoredClock anchoredClock = this.f33485OooOO0O;
        long jNanoTime = anchoredClock.f33449OooO0O0 + (anchoredClock.f33448OooO00o.nanoTime() - anchoredClock.f33450OooO0OO);
        synchronized (this.f33489OooOOOO) {
            if (this.f33494OooOo0) {
                f33477OooOo0O.log(Level.FINE, "Calling end() on an ended Span.");
                return;
            }
            this.f33495OooOo00 = jNanoTime;
            this.f33494OooOo0 = true;
            this.f33482OooO0oO.o0000Oo(this);
        }
    }

    @Override // io.opentelemetry.context.ImplicitContextKeyed
    public final /* synthetic */ Context OooO0o0(Context context) {
        return io.opentelemetry.api.trace.OooO00o.OooO00o(this, context);
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO0oO(StatusCode statusCode) {
        OooO(statusCode, "");
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO0oo(AttributeKey attributeKey, Object obj) {
        if (attributeKey != null && !attributeKey.getKey().isEmpty() && obj != null) {
            synchronized (this.f33489OooOOOO) {
                if (this.f33494OooOo0) {
                    f33477OooOo0O.log(Level.FINE, "Calling setAttribute() on an ended Span.");
                } else {
                    if (this.f33492OooOOo0 == null) {
                        this.f33492OooOOo0 = new AttributesMap(this.f33479OooO0Oo.OooO0O0(), this.f33479OooO0Oo.OooO00o());
                    }
                    this.f33492OooOOo0.OooO0O0(attributeKey, obj);
                }
            }
        }
        return this;
    }

    public final String toString() {
        String str;
        String strValueOf;
        String strValueOf2;
        long j;
        synchronized (this.f33489OooOOOO) {
            str = this.f33490OooOOOo;
            strValueOf = String.valueOf(this.f33492OooOOo0);
            strValueOf2 = String.valueOf(this.f33493OooOOoo);
            j = this.f33495OooOo00;
        }
        return "RecordEventsReadableSpan{traceId=" + this.f33481OooO0o0.OooO0Oo() + ", spanId=" + this.f33481OooO0o0.OooO0OO() + ", parentSpanContext=" + this.f33480OooO0o + ", name=" + str + ", kind=" + this.f33484OooOO0 + ", attributes=" + strValueOf + ", status=" + strValueOf2 + ", totalRecordedEvents=0, totalRecordedLinks=" + this.f33478OooO + ", startEpochNanos=" + this.f33487OooOOO + ", endEpochNanos=" + j + "}";
    }
}
