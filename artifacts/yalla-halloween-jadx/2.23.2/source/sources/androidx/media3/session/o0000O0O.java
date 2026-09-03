package androidx.media3.session;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.NumberDataPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O0O implements p559o0oOo.o00O0O, BaseQuickAdapter.OooOO0, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9294OooO0Oo;

    public /* synthetic */ o0000O0O(Object obj) {
        this.f9294OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        MainRoomMineJoinedFragment.initView$lambda$2((MainRoomMineJoinedFragment) this.f9294OooO0Oo);
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MomentReplyActivity this$0 = (MomentReplyActivity) this.f9294OooO0Oo;
        int i = MomentReplyActivity.f25700OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoOO(false);
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0o0((NumberDataPoint.Builder) this.f9294OooO0Oo, (AttributeKey) obj, obj2);
    }
}
