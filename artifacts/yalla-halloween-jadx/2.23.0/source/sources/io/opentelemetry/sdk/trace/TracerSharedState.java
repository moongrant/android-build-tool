package io.opentelemetry.sdk.trace;

import io.opentelemetry.compat.Supplier;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.samplers.Sampler;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;
import p022Oooo00O.o0O00oO0;

/* JADX INFO: loaded from: classes5.dex */
final class TracerSharedState {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Clock f33534OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final IdGenerator f33535OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f33536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Supplier<SpanLimits> f33537OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Resource f33538OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Sampler f33539OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final SpanProcessor f33540OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f33533OooO00o = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public volatile CompletableResultCode f33532OooO = null;

    public TracerSharedState(Clock clock, IdGenerator idGenerator, Resource resource, o0O00oO0 o0o00oo1, Sampler sampler, ArrayList arrayList) {
        this.f33534OooO0O0 = clock;
        this.f33535OooO0OO = idGenerator;
        this.f33536OooO0Oo = (idGenerator instanceof RandomIdGenerator) || (idGenerator instanceof AndroidFriendlyRandomIdGenerator);
        this.f33538OooO0o0 = resource;
        this.f33537OooO0o = o0o00oo1;
        this.f33539OooO0oO = sampler;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((SpanProcessor) it.next());
        }
        this.f33540OooO0oo = arrayList2.isEmpty() ? NoopSpanProcessor.f33474OooO0Oo : arrayList2.size() == 1 ? (SpanProcessor) arrayList2.get(0) : new MultiSpanProcessor(new ArrayList(arrayList2));
    }
}
