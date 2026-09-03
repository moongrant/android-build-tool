package androidx.media3.session;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.CommonAdapter;
import io.opentelemetry.proto.trace.v1.Span;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O0o implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooOO0, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9311OooO0Oo;

    public /* synthetic */ o000O0o(Object obj) {
        this.f9311OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        MainRoomRecommendFragment.initView$lambda$5((MainRoomRecommendFragment) this.f9311OooO0Oo);
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((Span.Event.Builder) this.f9311OooO0Oo).OooO0O0(CommonAdapter.OooO00o((AttributeKey) obj, obj2));
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((o000OO0O.OooO0OO) this.f9311OooO0Oo).getClass();
        throw null;
    }
}
