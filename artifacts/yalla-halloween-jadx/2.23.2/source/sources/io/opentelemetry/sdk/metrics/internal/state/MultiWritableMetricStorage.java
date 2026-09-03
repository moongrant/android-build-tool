package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class MultiWritableMetricStorage implements WriteableMetricStorage {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<WriteableMetricStorage> f32854OooO00o;

    public MultiWritableMetricStorage(ArrayList arrayList) {
        this.f32854OooO00o = arrayList;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public final void OooO00o(Attributes attributes, Context context) {
        BoundStorageHandle boundStorageHandleOooO0O0 = OooO0O0(attributes);
        try {
            ((MultiBoundStorageHandle) boundStorageHandleOooO0O0).OooO00o(attributes, context);
        } finally {
            ((MultiBoundStorageHandle) boundStorageHandleOooO0O0).release();
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public final BoundStorageHandle OooO0O0(Attributes attributes) {
        List<WriteableMetricStorage> list = this.f32854OooO00o;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<WriteableMetricStorage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().OooO0O0(attributes));
        }
        return new MultiBoundStorageHandle(arrayList);
    }
}
