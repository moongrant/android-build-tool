package p496o0o00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49072OooO0Oo;

    public o0O0O0Oo(UserInfoActivity userInfoActivity) {
        this.f49072OooO0Oo = userInfoActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            this.f49072OooO0Oo.Oooo00O();
        }
    }
}
