package androidx.media3.session;

import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineRecentlyFragment;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.Exemplar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000OO implements p559o0oOo.o00O0O, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9312OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9313OooO0o0;

    public /* synthetic */ o000OO(Object obj, int i) {
        this.f9312OooO0Oo = i;
        this.f9313OooO0o0 = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = this.f9312OooO0Oo;
        Object obj = this.f9313OooO0o0;
        switch (i) {
            case 2:
                RoomLuckyNumberHistoryDialog this$0 = (RoomLuckyNumberHistoryDialog) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOOO(true);
                break;
            default:
                MainRoomMineRecentlyFragment.initView$lambda$0((MainRoomMineRecentlyFragment) obj);
                break;
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0Oo((Exemplar.Builder) this.f9313OooO0o0, (AttributeKey) obj, obj2);
    }
}
