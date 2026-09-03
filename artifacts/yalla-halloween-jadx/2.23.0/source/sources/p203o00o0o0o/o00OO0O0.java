package p203o00o0o0o;

import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO0O0 implements o00O.OooO00o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39204OooO0Oo;

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        RoomMoraGameHistoryActivity this$0 = (RoomMoraGameHistoryActivity) this.f39204OooO0Oo;
        int i = RoomMoraGameHistoryActivity.f26615OooOoOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26623OooOo0o = "";
        this$0.OooOo0(true);
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onDeviceInfoChanged((DeviceInfo) this.f39204OooO0Oo);
    }
}
