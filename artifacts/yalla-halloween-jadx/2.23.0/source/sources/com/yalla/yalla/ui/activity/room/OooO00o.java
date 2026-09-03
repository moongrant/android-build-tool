package com.yalla.yalla.ui.activity.room;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.NumberDataPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO00o implements p562o0oOo0O.o000oOoO, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f26589OooO0Oo;

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        BanEnterRoomListActivity this$0 = (BanEnterRoomListActivity) this.f26589OooO0Oo;
        int i = BanEnterRoomListActivity.f26465OooOooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f26476OooOoOO) {
            this$0.OooOo0o(this$0.f26477OooOoo, true);
        } else {
            this$0.f26467OooOOo0 = "";
            this$0.OooOo0O(true);
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0o0((NumberDataPoint.Builder) this.f26589OooO0Oo, (AttributeKey) obj, obj2);
    }
}
