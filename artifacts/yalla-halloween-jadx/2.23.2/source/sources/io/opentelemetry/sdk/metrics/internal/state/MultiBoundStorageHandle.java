package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class MultiBoundStorageHandle implements BoundStorageHandle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<BoundStorageHandle> f32853OooO00o;

    public MultiBoundStorageHandle(ArrayList arrayList) {
        this.f32853OooO00o = arrayList;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
    public final void OooO00o(Attributes attributes, Context context) {
        Iterator<BoundStorageHandle> it = this.f32853OooO00o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(attributes, context);
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
    public final void release() {
        Iterator<BoundStorageHandle> it = this.f32853OooO00o.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }
}
