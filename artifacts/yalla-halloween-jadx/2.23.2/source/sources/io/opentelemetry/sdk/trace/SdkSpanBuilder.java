package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.OooO;
import io.opentelemetry.api.common.OooO0o;
import io.opentelemetry.api.internal.AutoValue_ImmutableSpanContext;
import io.opentelemetry.api.internal.ImmutableSpanContext;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.api.internal.OtelEncodingUtils;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.samplers.SamplingDecision;
import io.opentelemetry.sdk.trace.samplers.SamplingResult;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class SdkSpanBuilder implements SpanBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f32965OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InstrumentationLibraryInfo f32966OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TracerSharedState f32967OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SpanLimits f32968OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Context f32970OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public AttributesMap f32971OooO0oO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public SpanKind f32969OooO0o = SpanKind.INTERNAL;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f32972OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f32964OooO = false;

    public SdkSpanBuilder(String str, InstrumentationLibraryInfo instrumentationLibraryInfo, TracerSharedState tracerSharedState, SpanLimits spanLimits) {
        this.f32965OooO00o = str;
        this.f32966OooO0O0 = instrumentationLibraryInfo;
        this.f32967OooO0OO = tracerSharedState;
        this.f32968OooO0Oo = spanLimits;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    @Override // io.opentelemetry.api.trace.SpanBuilder
    public final Span OooO00o() {
        boolean z;
        AutoValue_ImmutableSpanContext autoValue_ImmutableSpanContextOooO0O0;
        AnchoredClock anchoredClock;
        long jNanoTime;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Context contextOooO00o = this.f32970OooO0o0;
        if (contextOooO00o == null) {
            contextOooO00o = io.opentelemetry.context.OooO0O0.OooO00o();
        }
        Span spanOooO0O0 = io.opentelemetry.api.trace.OooO00o.OooO0O0(contextOooO00o);
        SpanContext spanContextOooO0O0 = spanOooO0O0.OooO0O0();
        TracerSharedState tracerSharedState = this.f32967OooO0OO;
        IdGenerator idGenerator = tracerSharedState.f33003OooO0OO;
        String strOooO00o = idGenerator.OooO00o();
        String strOooO0O0 = !spanContextOooO0O0.isValid() ? idGenerator.OooO0O0() : spanContextOooO0O0.OooO0Oo();
        List<LinkData> listEmptyList = Collections.emptyList();
        Attributes attributesOooO0O0 = this.f32971OooO0oO;
        if (attributesOooO0O0 == null) {
            attributesOooO0O0 = OooO.OooO0O0();
        }
        SamplingResult samplingResultOooO00o = tracerSharedState.f33007OooO0oO.OooO00o(contextOooO00o, strOooO0O0, this.f32965OooO00o, this.f32969OooO0o, attributesOooO0O0, listEmptyList);
        SamplingDecision samplingDecisionOooO0O0 = this.f32964OooO ? SamplingDecision.RECORD_AND_SAMPLE : samplingResultOooO00o.OooO0O0();
        TraceState traceStateOooO0OO = samplingResultOooO00o.OooO0OO(spanContextOooO0O0.OooO0oO());
        SamplingDecision samplingDecision = SamplingDecision.RECORD_AND_SAMPLE;
        TraceFlags traceFlagsOooO0O0 = samplingDecision.equals(samplingDecisionOooO0O0) ? io.opentelemetry.api.trace.OooO0O0.OooO0O0() : io.opentelemetry.api.trace.OooO0O0.OooO00o();
        boolean z6 = false;
        if (tracerSharedState.f33004OooO0Oo) {
            z = true;
            autoValue_ImmutableSpanContextOooO0O0 = ImmutableSpanContext.OooO0O0(strOooO0O0, strOooO00o, traceFlagsOooO0O0, traceStateOooO0OO, true);
        } else {
            SpanContext spanContext = ImmutableSpanContext.f32504OooO00o;
            if (strOooO00o == null || strOooO00o.length() != 16 || "0000000000000000".contentEquals(strOooO00o)) {
                z2 = false;
            } else {
                char[] cArr = OtelEncodingUtils.f32509OooO00o;
                int length = strOooO00o.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z5 = true;
                        break;
                    }
                    if (!OtelEncodingUtils.f32511OooO0OO[strOooO00o.charAt(i)]) {
                        z5 = false;
                        break;
                    }
                    i++;
                }
                if (z5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                if (strOooO0O0 == null || strOooO0O0.length() != 32 || "00000000000000000000000000000000".contentEquals(strOooO0O0)) {
                    z3 = false;
                } else {
                    char[] cArr2 = OtelEncodingUtils.f32509OooO00o;
                    int length2 = strOooO0O0.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z4 = true;
                            break;
                        }
                        if (!OtelEncodingUtils.f32511OooO0OO[strOooO0O0.charAt(i2)]) {
                            z4 = false;
                            break;
                        }
                        i2++;
                    }
                    if (z4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    z = true;
                    autoValue_ImmutableSpanContextOooO0O0 = ImmutableSpanContext.OooO0O0(strOooO0O0, strOooO00o, traceFlagsOooO0O0, traceStateOooO0OO, true);
                }
            }
            autoValue_ImmutableSpanContextOooO0O0 = ImmutableSpanContext.OooO0O0("00000000000000000000000000000000", "0000000000000000", traceFlagsOooO0O0, traceStateOooO0OO, false);
            z = true;
        }
        if (!((SamplingDecision.RECORD_ONLY.equals(samplingDecisionOooO0O0) || samplingDecision.equals(samplingDecisionOooO0O0)) ? z : false)) {
            return io.opentelemetry.api.trace.OooO00o.OooO0OO(autoValue_ImmutableSpanContextOooO0O0);
        }
        Attributes attributesOooO00o = samplingResultOooO00o.OooO00o();
        if (!attributesOooO00o.isEmpty()) {
            attributesOooO00o.OooO0o(new BiConsumer() { // from class: io.opentelemetry.sdk.trace.OooO00o
                @Override // io.opentelemetry.compat.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AttributeKey attributeKey = (AttributeKey) obj;
                    SdkSpanBuilder sdkSpanBuilder = this.f32942OooO0Oo;
                    AttributesMap attributesMap = sdkSpanBuilder.f32971OooO0oO;
                    if (attributesMap == null) {
                        SpanLimits spanLimits = sdkSpanBuilder.f32968OooO0Oo;
                        attributesMap = new AttributesMap(spanLimits.OooO0O0(), spanLimits.OooO00o());
                        sdkSpanBuilder.f32971OooO0oO = attributesMap;
                    }
                    attributesMap.OooO0O0(attributeKey, obj2);
                }
            });
        }
        AttributesMap attributesMap = this.f32971OooO0oO;
        this.f32971OooO0oO = null;
        String str = this.f32965OooO00o;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f32966OooO0O0;
        SpanKind spanKind = this.f32969OooO0o;
        SpanLimits spanLimits = this.f32968OooO0Oo;
        SpanProcessor spanProcessor = tracerSharedState.f33008OooO0oo;
        Resource resource = tracerSharedState.f33006OooO0o0;
        long j = this.f32972OooO0oo;
        Logger logger = RecordEventsReadableSpan.f32944OooOo0o;
        if (spanOooO0O0 instanceof RecordEventsReadableSpan) {
            anchoredClock = ((RecordEventsReadableSpan) spanOooO0O0).f32952OooOO0O;
        } else {
            Clock clock = tracerSharedState.f33002OooO0O0;
            anchoredClock = new AnchoredClock(clock, clock.OooO00o(), clock.nanoTime());
            z6 = true;
        }
        if (j != 0) {
            jNanoTime = j;
        } else if (z6) {
            j = anchoredClock.f32916OooO0O0;
            jNanoTime = j;
        } else {
            jNanoTime = anchoredClock.f32916OooO0O0 + (anchoredClock.f32915OooO00o.nanoTime() - anchoredClock.f32917OooO0OO);
        }
        RecordEventsReadableSpan recordEventsReadableSpan = new RecordEventsReadableSpan(autoValue_ImmutableSpanContextOooO0O0, str, instrumentationLibraryInfo, spanKind, spanOooO0O0.OooO0O0(), spanLimits, spanProcessor, anchoredClock, resource, attributesMap, listEmptyList, jNanoTime);
        spanProcessor.o0Oo0oo(contextOooO00o, recordEventsReadableSpan);
        return recordEventsReadableSpan;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public final SpanBuilder OooO0O0() {
        this.f32964OooO = true;
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public final SpanBuilder OooO0OO() {
        this.f32970OooO0o0 = io.opentelemetry.context.OooO0O0.OooO0O0();
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public final SpanBuilder OooO0Oo(Context context) {
        if (context == null) {
            return this;
        }
        this.f32970OooO0o0 = context;
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public final SpanBuilder OooO0o(SpanKind spanKind) {
        if (spanKind == null) {
            return this;
        }
        this.f32969OooO0o = spanKind;
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public final SpanBuilder OooO0o0(InternalAttributeKeyImpl internalAttributeKeyImpl, Object obj) {
        if (internalAttributeKeyImpl != null && !internalAttributeKeyImpl.f32506OooO0O0.isEmpty() && obj != null) {
            AttributesMap attributesMap = this.f32971OooO0oO;
            if (attributesMap == null) {
                SpanLimits spanLimits = this.f32968OooO0Oo;
                attributesMap = new AttributesMap(spanLimits.OooO0O0(), spanLimits.OooO00o());
                this.f32971OooO0oO = attributesMap;
            }
            attributesMap.OooO0O0(internalAttributeKeyImpl, obj);
        }
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public final SpanBuilder OooO0oO(long j, TimeUnit timeUnit) {
        if (j >= 0 && timeUnit != null) {
            this.f32972OooO0oo = timeUnit.toNanos(j);
        }
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public final SpanBuilder OooO0oo(String str) {
        OooO0o0(OooO0o.OooO0o0("type"), str);
        return this;
    }
}
