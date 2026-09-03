package androidx.media3.session;

import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineRecentlyFragment;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.Exemplar;
import kotlin.jvm.internal.Intrinsics;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O0 implements o0O0OO0, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9300OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9301OooO0o0;

    public /* synthetic */ o0000O0(Object obj, int i) {
        this.f9300OooO0Oo = i;
        this.f9301OooO0o0 = obj;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f9300OooO0Oo;
        Object obj = this.f9301OooO0o0;
        switch (i) {
            case 2:
                MomentReplyActivity this$0 = (MomentReplyActivity) obj;
                int i2 = MomentReplyActivity.f25702OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoOO(false);
                break;
            case 3:
                RoomLuckyNumberHistoryDialog this$1 = (RoomLuckyNumberHistoryDialog) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOOO(true);
                break;
            default:
                MainRoomMineRecentlyFragment.initView$lambda$0((MainRoomMineRecentlyFragment) obj);
                break;
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0Oo((Exemplar.Builder) this.f9301OooO0o0, (AttributeKey) obj, obj2);
    }
}
