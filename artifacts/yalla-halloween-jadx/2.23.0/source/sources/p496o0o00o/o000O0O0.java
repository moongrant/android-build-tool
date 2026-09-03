package p496o0o00o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.fragment.PacketHistoryListFragment;
import kotlin.jvm.internal.Intrinsics;
import p420o0OoO0OO.o0ooOOo;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O0O0 implements o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48989OooO0o0;

    public /* synthetic */ o000O0O0(Object obj, int i) {
        this.f48988OooO0Oo = i;
        this.f48989OooO0o0 = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        int i = this.f48988OooO0Oo;
        Object obj = this.f48989OooO0o0;
        switch (i) {
            case 0:
                FollowerActivity this$0 = (FollowerActivity) obj;
                int i2 = FollowerActivity.f27105OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                o0ooOOo.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0), new o0O0ooO(this$0, null)).observe(this$0, new FollowerActivity.OooO00o(new o00oOoo(this$0, false)));
                break;
            default:
                PacketHistoryListFragment.initView$lambda$0((PacketHistoryListFragment) obj);
                break;
        }
    }
}
