package androidx.compose.ui.graphics.colorspace;

import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import kotlin.jvm.internal.Intrinsics;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements DoubleFunction, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4171OooO0Oo;

    public /* synthetic */ OooOOO(Object obj) {
        this.f4171OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        RoomMoraGameHistoryActivity this$0 = (RoomMoraGameHistoryActivity) this.f4171OooO0Oo;
        int i = RoomMoraGameHistoryActivity.f26161OooOoOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26169OooOo0o = "";
        this$0.OooOo0(true);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$6((TransferParameters) this.f4171OooO0Oo, d);
    }
}
