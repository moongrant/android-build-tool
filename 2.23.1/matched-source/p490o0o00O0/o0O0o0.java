package p490o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0o0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48844OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48845OooO0o0;

    public /* synthetic */ o0O0o0(Object obj, int i) {
        this.f48844OooO0Oo = i;
        this.f48845OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48844OooO0Oo;
        Object obj2 = this.f48845OooO0o0;
        switch (i) {
            case 0:
                UntieAccountBindActivity this$0 = (UntieAccountBindActivity) obj2;
                int i2 = UntieAccountBindActivity.f24889OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                BaseActivityK.OooOo0o(this$0, null, 0L, 3);
                ((AccountVM) this$0.f24892OooOo00.getValue()).getAccountBindInfo().observe(this$0, new o0oOo0O0(this$0, 0));
                break;
            default:
                RoomThemeCustomizeFragment.initView$lambda$0((RoomThemeCustomizeFragment) obj2, (Boolean) obj);
                break;
        }
    }
}
