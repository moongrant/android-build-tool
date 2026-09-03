package p200o00o0o;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000000 implements o00O.OooO00o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39121OooO0o0;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f39120OooO0Oo = i;
        this.f39121OooO0o0 = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        int i = this.f39120OooO0Oo;
        Object obj = this.f39121OooO0o0;
        switch (i) {
            case 1:
                UserRoomsActivity this$0 = (UserRoomsActivity) obj;
                int i2 = UserRoomsActivity.f27361OooOoO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f27367OooOo0o = 1;
                this$0.OooOoO0(true);
                break;
            default:
                MainRoomMineFollowingFragment.initView$lambda$0((MainRoomMineFollowingFragment) obj);
                break;
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o0O0O00();
    }
}
