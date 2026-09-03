package p203o00o0o0o;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.trackselection.OooO;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo00o implements o00O.OooO00o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39299OooO0Oo;

    public /* synthetic */ oo00o(Object obj) {
        this.f39299OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        LuckyPacketDetailActivity this$0 = (LuckyPacketDetailActivity) this.f39299OooO0Oo;
        int i = LuckyPacketDetailActivity.f26556OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO0();
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onTrackSelectionParametersChanged((OooO) this.f39299OooO0Oo);
    }
}
