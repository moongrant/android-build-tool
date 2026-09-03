package p404o0Oo0OO0;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.SummaryDataPoint;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOo00 implements BaseQuickAdapter.OooO0o, o00O0O, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f43658OooO0Oo;

    public /* synthetic */ OooOo00(Object obj) {
        this.f43658OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        ArrearsDetailActivity this$0 = (ArrearsDetailActivity) this.f43658OooO0Oo;
        int i = ArrearsDetailActivity.f26503OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(true);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MomentPowerSelectActivity this$0 = (MomentPowerSelectActivity) this.f43658OooO0Oo;
        int i2 = MomentPowerSelectActivity.f25693OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtra("Data", (Serializable) this$0.f25694OooOOoo.get(i));
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0OO((SummaryDataPoint.Builder) this.f43658OooO0Oo, (AttributeKey) obj, obj2);
    }
}
