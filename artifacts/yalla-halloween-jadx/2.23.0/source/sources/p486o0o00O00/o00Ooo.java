package p486o0o00O00;

import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import kotlin.jvm.internal.Intrinsics;
import p420o0OoO0OO.o0ooOOo;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00Ooo implements o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48330OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48331OooO0o0;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f48330OooO0Oo = i;
        this.f48331OooO0o0 = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        int i = this.f48330OooO0Oo;
        Object obj = this.f48331OooO0o0;
        switch (i) {
            case 0:
                BlackListActivity this$0 = (BlackListActivity) obj;
                int i2 = BlackListActivity.f25368OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f25370OooOOo0 = 1;
                o0ooOOo.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0), new o00oO0o(this$0, null)).observe(this$0, new BlackListActivity.OooO00o(new o0ooOOo(this$0, true)));
                break;
            default:
                MainRoomMineJoinedFragment.initView$lambda$0((MainRoomMineJoinedFragment) obj);
                break;
        }
    }
}
