package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.ReOpenAccountActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ReOpenAccountActivity f47294OooO0Oo;

    public o0O00000(ReOpenAccountActivity reOpenAccountActivity) {
        this.f47294OooO0Oo = reOpenAccountActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f47294OooO0Oo.finish();
    }
}
