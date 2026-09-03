package p484o0o00O;

import com.yalla.yalla.model.moment.MomentReplyModel;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.HistogramDataPoint;
import p592o0oo00O.OooOOO0;
import p598o0oo00oO.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O0O implements o0000O00.OooO00o, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f47735OooO0Oo;

    @Override // o0oo00oO.o0000O00.OooO00o
    public final void OooO0Oo() {
        OooOOO0.OooO0oO("onTextClicked setViewData 动态详情 postCommentSonModel = " + ((MomentReplyModel) this.f47735OooO0Oo));
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO00o((HistogramDataPoint.Builder) this.f47735OooO0Oo, (AttributeKey) obj, obj2);
    }
}
