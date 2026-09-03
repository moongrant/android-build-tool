package io.opentelemetry.sdk.trace;

import androidx.media3.session.o000OO00;
import io.opentelemetry.compat.Supplier;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.samplers.Sampler;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class TracerSharedState {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Clock f33002OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final IdGenerator f33003OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f33004OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Supplier<SpanLimits> f33005OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Resource f33006OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Sampler f33007OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final SpanProcessor f33008OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f33001OooO00o = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public volatile CompletableResultCode f33000OooO = null;

    public TracerSharedState(Clock clock, IdGenerator idGenerator, Resource resource, o000OO00 o000oo01, Sampler sampler, ArrayList arrayList) {
        this.f33002OooO0O0 = clock;
        this.f33003OooO0OO = idGenerator;
        this.f33004OooO0Oo = (idGenerator instanceof RandomIdGenerator) || (idGenerator instanceof AndroidFriendlyRandomIdGenerator);
        this.f33006OooO0o0 = resource;
        this.f33005OooO0o = o000oo01;
        this.f33007OooO0oO = sampler;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((SpanProcessor) it.next());
        }
        this.f33008OooO0oo = arrayList2.isEmpty() ? NoopSpanProcessor.f32941OooO0Oo : arrayList2.size() == 1 ? (SpanProcessor) arrayList2.get(0) : new MultiSpanProcessor(new ArrayList(arrayList2));
    }
}
