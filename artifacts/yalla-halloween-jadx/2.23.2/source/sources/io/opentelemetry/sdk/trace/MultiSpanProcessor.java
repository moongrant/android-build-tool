package io.opentelemetry.sdk.trace;

import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.CompletableResultCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
final class MultiSpanProcessor implements SpanProcessor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f32937OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<SpanProcessor> f32938OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f32939OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicBoolean f32940OooO0oO = new AtomicBoolean(false);

    public MultiSpanProcessor(ArrayList arrayList) {
        this.f32938OooO0o = arrayList;
        this.f32937OooO0Oo = new ArrayList(arrayList.size());
        this.f32939OooO0o0 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SpanProcessor spanProcessor = (SpanProcessor) it.next();
            if (spanProcessor.OooOOO()) {
                this.f32937OooO0Oo.add(spanProcessor);
            }
            if (spanProcessor.o0000O()) {
                this.f32939OooO0o0.add(spanProcessor);
            }
        }
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean OooOOO() {
        return !this.f32937OooO0Oo.isEmpty();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().OooO0OO(10L, TimeUnit.SECONDS);
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean o0000O() {
        return !this.f32939OooO0o0.isEmpty();
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0000Oo(ReadableSpan readableSpan) {
        Iterator it = this.f32939OooO0o0.iterator();
        while (it.hasNext()) {
            ((SpanProcessor) it.next()).o0000Oo(readableSpan);
        }
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0Oo0oo(Context context, ReadWriteSpan readWriteSpan) {
        Iterator it = this.f32937OooO0Oo.iterator();
        while (it.hasNext()) {
            ((SpanProcessor) it.next()).o0Oo0oo(context, readWriteSpan);
        }
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final CompletableResultCode shutdown() {
        if (this.f32940OooO0oO.getAndSet(true)) {
            return CompletableResultCode.f32659OooO0Oo;
        }
        List<SpanProcessor> list = this.f32938OooO0o;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<SpanProcessor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().shutdown());
        }
        return CompletableResultCode.OooO0Oo(arrayList);
    }
}
