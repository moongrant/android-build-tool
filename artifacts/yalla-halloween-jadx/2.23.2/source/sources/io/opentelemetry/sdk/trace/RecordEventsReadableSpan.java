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
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.data.StatusData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class RecordEventsReadableSpan implements ReadWriteSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final Logger f32944OooOo0o = Logger.getLogger(RecordEventsReadableSpan.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SpanLimits f32946OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SpanContext f32947OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SpanContext f32948OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SpanProcessor f32949OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<LinkData> f32950OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final SpanKind f32951OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AnchoredClock f32952OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Resource f32953OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f32954OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final InstrumentationLibraryInfo f32955OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final String f32957OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public AttributesMap f32959OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f32961OooOo0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Object f32956OooOOOO = new Object();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f32960OooOOoo = 0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public StatusData f32962OooOo00 = io.opentelemetry.sdk.trace.data.OooO0O0.OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f32945OooO = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f32963OooOo0O = false;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList f32958OooOOo = new ArrayList();

    public RecordEventsReadableSpan(SpanContext spanContext, String str, InstrumentationLibraryInfo instrumentationLibraryInfo, SpanKind spanKind, SpanContext spanContext2, SpanLimits spanLimits, SpanProcessor spanProcessor, AnchoredClock anchoredClock, Resource resource, @Nullable AttributesMap attributesMap, List list, long j) {
        this.f32948OooO0o0 = spanContext;
        this.f32955OooOOO0 = instrumentationLibraryInfo;
        this.f32947OooO0o = spanContext2;
        this.f32950OooO0oo = list;
        this.f32957OooOOOo = str;
        this.f32951OooOO0 = spanKind;
        this.f32949OooO0oO = spanProcessor;
        this.f32953OooOO0o = resource;
        this.f32952OooOO0O = anchoredClock;
        this.f32954OooOOO = j;
        this.f32959OooOOo0 = attributesMap;
        this.f32946OooO0Oo = spanLimits;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO(StatusCode statusCode) {
        OooOO0O(statusCode, "");
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    @Nullable
    public final Object OooO00o(InternalAttributeKeyImpl internalAttributeKeyImpl) {
        Object obj;
        synchronized (this.f32956OooOOOO) {
            AttributesMap attributesMap = this.f32959OooOOo0;
            obj = attributesMap == null ? null : attributesMap.get(internalAttributeKeyImpl);
        }
        return obj;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final SpanContext OooO0O0() {
        return this.f32948OooO0o0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[LOOP:0: B:21:0x006a->B:26:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d A[EDGE_INSN: B:46:0x008d->B:27:0x008d BREAK  A[LOOP:0: B:21:0x006a->B:26:0x0079], SYNTHETIC] */
    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO0OO(Attributes attributes, String str) {
        boolean z;
        AttributesBuilder attributesBuilderOooO00o;
        if (attributes == null) {
            attributes = OooO.OooO0O0();
        }
        int size = attributes.size();
        AnchoredClock anchoredClock = this.f32952OooOO0O;
        long jNanoTime = anchoredClock.f32916OooO0O0 + (anchoredClock.f32915OooO00o.nanoTime() - anchoredClock.f32917OooO0OO);
        int iOooO0OO = this.f32946OooO0Oo.OooO0OO();
        int iOooO00o = this.f32946OooO0Oo.OooO00o();
        int i = 0;
        if (!attributes.isEmpty() && attributes.size() > iOooO0OO) {
            attributesBuilderOooO00o = OooO.OooO00o();
            for (Map.Entry<AttributeKey<?>, Object> entry : attributes.OooO0Oo().entrySet()) {
                if (i >= iOooO0OO) {
                    break;
                    break;
                }
                attributesBuilderOooO00o.OooO0Oo(entry.getKey(), AttributeUtil.OooO00o(iOooO00o, entry.getValue()));
                i++;
            }
            attributes = attributesBuilderOooO00o.build();
        } else if (iOooO00o != Integer.MAX_VALUE) {
            Iterator<T> it = attributes.OooO0Oo().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!AttributeUtil.OooO0O0(iOooO00o, it.next())) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                attributesBuilderOooO00o = OooO.OooO00o();
                while (r11.hasNext()) {
                    if (i >= iOooO0OO) {
                        break;
                    }
                    attributesBuilderOooO00o.OooO0Oo(entry.getKey(), AttributeUtil.OooO00o(iOooO00o, entry.getValue()));
                    i++;
                }
                attributes = attributesBuilderOooO00o.build();
            }
        }
        EventData eventDataOooO00o = io.opentelemetry.sdk.trace.data.OooO00o.OooO00o(size, jNanoTime, attributes, str);
        synchronized (this.f32956OooOOOO) {
            if (this.f32963OooOo0O) {
                f32944OooOo0o.log(Level.FINE, "Calling addEvent() on an ended Span.");
            } else {
                if (this.f32958OooOOo.size() < this.f32946OooO0Oo.OooO0o0()) {
                    this.f32958OooOOo.add(eventDataOooO00o);
                }
                this.f32960OooOOoo++;
            }
        }
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public final SpanData OooO0Oo() {
        List listUnmodifiableList;
        Attributes attributesOooO0O0;
        AutoValue_SpanWrapper autoValue_SpanWrapper;
        synchronized (this.f32956OooOOOO) {
            List<LinkData> list = this.f32950OooO0oo;
            ArrayList arrayList = this.f32958OooOOo;
            if (arrayList.isEmpty()) {
                listUnmodifiableList = Collections.emptyList();
            } else {
                listUnmodifiableList = this.f32963OooOo0O ? Collections.unmodifiableList(arrayList) : Collections.unmodifiableList(new ArrayList(arrayList));
            }
            List list2 = listUnmodifiableList;
            AttributesMap attributesMap = this.f32959OooOOo0;
            if (attributesMap == null || attributesMap.isEmpty()) {
                attributesOooO0O0 = OooO.OooO0O0();
            } else if (this.f32963OooOo0O) {
                attributesOooO0O0 = this.f32959OooOOo0;
            } else {
                AttributesMap attributesMap2 = this.f32959OooOOo0;
                attributesMap2.getClass();
                AttributesBuilder attributesBuilderOooO00o = OooO.OooO00o();
                attributesBuilderOooO00o.OooO0OO(attributesMap2);
                attributesOooO0O0 = attributesBuilderOooO00o.build();
            }
            Attributes attributes = attributesOooO0O0;
            AttributesMap attributesMap3 = this.f32959OooOOo0;
            autoValue_SpanWrapper = new AutoValue_SpanWrapper(this, list, list2, attributes, attributesMap3 == null ? 0 : attributesMap3.f32919OooO0o, this.f32960OooOOoo, OooO0o(), this.f32957OooOOOo, this.f32961OooOo0, this.f32963OooOo0O);
        }
        return autoValue_SpanWrapper;
    }

    public final StatusData OooO0o() {
        StatusData statusData;
        synchronized (this.f32956OooOOOO) {
            statusData = this.f32962OooOo00;
        }
        return statusData;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO0o0(InternalAttributeKeyImpl internalAttributeKeyImpl, int i) {
        OooOO0(internalAttributeKeyImpl, Long.valueOf(i));
        return this;
    }

    @Override // io.opentelemetry.context.ImplicitContextKeyed
    public final /* synthetic */ Context OooO0oO(Context context) {
        return io.opentelemetry.api.trace.OooO00o.OooO00o(this, context);
    }

    @Override // io.opentelemetry.api.trace.Span
    public final void OooO0oo() {
        AnchoredClock anchoredClock = this.f32952OooOO0O;
        long jNanoTime = anchoredClock.f32916OooO0O0 + (anchoredClock.f32915OooO00o.nanoTime() - anchoredClock.f32917OooO0OO);
        synchronized (this.f32956OooOOOO) {
            if (this.f32963OooOo0O) {
                f32944OooOo0o.log(Level.FINE, "Calling end() on an ended Span.");
                return;
            }
            this.f32961OooOo0 = jNanoTime;
            this.f32963OooOo0O = true;
            this.f32949OooO0oO.o0000Oo(this);
        }
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooOO0(AttributeKey attributeKey, Object obj) {
        if (attributeKey != null && !attributeKey.getKey().isEmpty() && obj != null) {
            synchronized (this.f32956OooOOOO) {
                if (this.f32963OooOo0O) {
                    f32944OooOo0o.log(Level.FINE, "Calling setAttribute() on an ended Span.");
                } else {
                    if (this.f32959OooOOo0 == null) {
                        this.f32959OooOOo0 = new AttributesMap(this.f32946OooO0Oo.OooO0O0(), this.f32946OooO0Oo.OooO00o());
                    }
                    this.f32959OooOOo0.OooO0O0(attributeKey, obj);
                }
            }
        }
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooOO0O(StatusCode statusCode, @Nullable String str) {
        if (statusCode != null) {
            synchronized (this.f32956OooOOOO) {
                if (this.f32963OooOo0O) {
                    f32944OooOo0o.log(Level.FINE, "Calling setStatus() on an ended Span.");
                } else {
                    this.f32962OooOo00 = io.opentelemetry.sdk.trace.data.OooO0O0.OooO00o(statusCode, str);
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
        long j2;
        synchronized (this.f32956OooOOOO) {
            str = this.f32957OooOOOo;
            strValueOf = String.valueOf(this.f32959OooOOo0);
            strValueOf2 = String.valueOf(this.f32962OooOo00);
            j = this.f32960OooOOoo;
            j2 = this.f32961OooOo0;
        }
        return "RecordEventsReadableSpan{traceId=" + this.f32948OooO0o0.OooO0Oo() + ", spanId=" + this.f32948OooO0o0.OooO0OO() + ", parentSpanContext=" + this.f32947OooO0o + ", name=" + str + ", kind=" + this.f32951OooOO0 + ", attributes=" + strValueOf + ", status=" + strValueOf2 + ", totalRecordedEvents=" + j + ", totalRecordedLinks=" + this.f32945OooO + ", startEpochNanos=" + this.f32954OooOOO + ", endEpochNanos=" + j2 + "}";
    }
}
