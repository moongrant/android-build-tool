package p487o0o00O;

import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import kotlin.jvm.internal.Intrinsics;
import p424o0OoO0Oo.o00O;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0ooOOo implements o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48901OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48902OooO0o0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f48901OooO0Oo = i;
        this.f48902OooO0o0 = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = this.f48901OooO0Oo;
        Object obj = this.f48902OooO0o0;
        switch (i) {
            case 0:
                BlackListActivity this$0 = (BlackListActivity) obj;
                int i2 = BlackListActivity.f24914OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f24916OooOOo0 = 1;
                o00O.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0), new o0Oo0oo(this$0, null)).observe(this$0, new BlackListActivity.OooO00o(new o0OO00O(this$0, true)));
                break;
            case 1:
                BanEnterRoomListActivity this$1 = (BanEnterRoomListActivity) obj;
                int i3 = BanEnterRoomListActivity.f26013OooOooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!this$1.f26024OooOoOO) {
                    this$1.f26015OooOOo0 = "";
                    this$1.OooOo0O(true);
                } else {
                    this$1.OooOo0o(this$1.f26025OooOoo, true);
                }
                break;
            default:
                ExploreCountryRoomListFragment.initView$lambda$0((ExploreCountryRoomListFragment) obj);
                break;
        }
    }
}
