package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f47359OooO0Oo;

    public oo0ooO(UntieAccountBindActivity untieAccountBindActivity) {
        this.f47359OooO0Oo = untieAccountBindActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = UntieAccountBindActivity.f25342OooOo;
        UntieAccountBindActivity untieAccountBindActivity = this.f47359OooO0Oo;
        untieAccountBindActivity.getClass();
        BaseActivityK.OooOo0o(untieAccountBindActivity, null, 0L, 3);
        ((AccountVM) untieAccountBindActivity.f25345OooOo00.getValue()).getAccountBindInfo().observe(untieAccountBindActivity, new oo0oO0(untieAccountBindActivity));
    }
}
