package androidx.compose.ui.graphics.colorspace;

import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p338o0OO0oOo.Oooo000;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements DoubleFunction, o00O0O, Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4166OooO0Oo;

    public /* synthetic */ OooO0O0(Object obj) {
        this.f4166OooO0Oo = obj;
    }

    @Override // p338o0OO0oOo.Oooo000
    public final void OooO00o(o0OO0oO0.OooOOO0 oooOOO0) {
        MainSearchRoomFragment.initView$lambda$1((MainSearchRoomFragment) this.f4166OooO0Oo, oooOOO0);
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        LuckyPacketDetailActivity this$0 = (LuckyPacketDetailActivity) this.f4166OooO0Oo;
        int i = LuckyPacketDetailActivity.f26104OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO0();
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$4((Function1) this.f4166OooO0Oo, d);
    }
}
