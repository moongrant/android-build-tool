package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class MultiBoundStorageHandle implements BoundStorageHandle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<BoundStorageHandle> f33387OooO00o;

    public MultiBoundStorageHandle(ArrayList arrayList) {
        this.f33387OooO00o = arrayList;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
    public final void OooO0O0(long j, Attributes attributes, Context context) {
        Iterator<BoundStorageHandle> it = this.f33387OooO00o.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0(j, attributes, context);
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
    public final void release() {
        Iterator<BoundStorageHandle> it = this.f33387OooO00o.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }
}
