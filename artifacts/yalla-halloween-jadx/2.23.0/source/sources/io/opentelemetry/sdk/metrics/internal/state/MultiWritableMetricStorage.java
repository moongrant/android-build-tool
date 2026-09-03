package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class MultiWritableMetricStorage implements WriteableMetricStorage {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<WriteableMetricStorage> f33388OooO00o;

    public MultiWritableMetricStorage(ArrayList arrayList) {
        this.f33388OooO00o = arrayList;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public final BoundStorageHandle OooO00o(Attributes attributes) {
        List<WriteableMetricStorage> list = this.f33388OooO00o;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<WriteableMetricStorage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().OooO00o(attributes));
        }
        return new MultiBoundStorageHandle(arrayList);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public final void OooO0O0(long j, Attributes attributes, Context context) {
        BoundStorageHandle boundStorageHandleOooO00o = OooO00o(attributes);
        try {
            ((MultiBoundStorageHandle) boundStorageHandleOooO00o).OooO0O0(1L, attributes, context);
        } finally {
            ((MultiBoundStorageHandle) boundStorageHandleOooO00o).release();
        }
    }
}
