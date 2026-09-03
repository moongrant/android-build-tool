package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import kotlin.jvm.internal.Intrinsics;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v0 implements o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f50596OooO0o0;

    public /* synthetic */ v0(Object obj, int i) {
        this.f50595OooO0Oo = i;
        this.f50596OooO0o0 = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = this.f50595OooO0Oo;
        Object obj = this.f50596OooO0o0;
        switch (i) {
            case 0:
                UserRoomsActivity this$0 = (UserRoomsActivity) obj;
                int i2 = UserRoomsActivity.f26896OooOoO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f26902OooOo0o = 1;
                this$0.OooOoO0(true);
                break;
            default:
                BadgeFragment.initView$lambda$0((BadgeFragment) obj);
                break;
        }
    }
}
