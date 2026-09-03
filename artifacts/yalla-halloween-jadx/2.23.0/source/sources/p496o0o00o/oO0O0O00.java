package p496o0o00o;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O0O00 implements BaseQuickAdapter.OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49161OooO0o0;

    public /* synthetic */ oO0O0O00(Object obj, int i) {
        this.f49160OooO0Oo = i;
        this.f49161OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        int i = this.f49160OooO0Oo;
        Object obj = this.f49161OooO0o0;
        switch (i) {
            case 0:
                UserRoomsActivity this$0 = (UserRoomsActivity) obj;
                int i2 = UserRoomsActivity.f27361OooOoO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0(false);
                break;
            default:
                MainRoomMineFollowingFragment.initView$lambda$1((MainRoomMineFollowingFragment) obj);
                break;
        }
    }
}
