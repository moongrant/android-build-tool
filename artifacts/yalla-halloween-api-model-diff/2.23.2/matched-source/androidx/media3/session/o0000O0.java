package androidx.media3.session;

import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.HistogramDataPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O0 implements p559o0oOo.o00O0O, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9293OooO0o0;

    public /* synthetic */ o0000O0(Object obj, int i) {
        this.f9292OooO0Oo = i;
        this.f9293OooO0o0 = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = this.f9292OooO0Oo;
        Object obj = this.f9293OooO0o0;
        switch (i) {
            case 1:
                MomentReplyActivity this$0 = (MomentReplyActivity) obj;
                int i2 = MomentReplyActivity.f25700OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoOO(true);
                break;
            default:
                MainRoomMineJoinedFragment.initView$lambda$1((MainRoomMineJoinedFragment) obj);
                break;
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO00o((HistogramDataPoint.Builder) this.f9293OooO0o0, (AttributeKey) obj, obj2);
    }
}
