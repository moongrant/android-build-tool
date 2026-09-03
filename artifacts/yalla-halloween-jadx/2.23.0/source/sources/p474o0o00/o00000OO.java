package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47234OooO0Oo;

    public o00000OO(LoginActivity loginActivity) {
        this.f47234OooO0Oo = loginActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
            this.f47234OooO0Oo.finish();
        }
    }
}
