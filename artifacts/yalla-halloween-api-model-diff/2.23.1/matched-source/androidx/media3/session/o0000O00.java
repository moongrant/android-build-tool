package androidx.media3.session;

import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.HistogramDataPoint;
import kotlin.jvm.internal.Intrinsics;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O00 implements o0O0OO0, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9302OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9303OooO0o0;

    public /* synthetic */ o0000O00(Object obj, int i) {
        this.f9302OooO0Oo = i;
        this.f9303OooO0o0 = obj;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f9302OooO0Oo;
        Object obj = this.f9303OooO0o0;
        switch (i) {
            case 1:
                ArrearsDetailActivity this$0 = (ArrearsDetailActivity) obj;
                int i2 = ArrearsDetailActivity.f26504OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO(false);
                break;
            default:
                MainRoomMineJoinedFragment.initView$lambda$1((MainRoomMineJoinedFragment) obj);
                break;
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO00o((HistogramDataPoint.Builder) this.f9303OooO0o0, (AttributeKey) obj, obj2);
    }
}
