package p486o0o00O00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48293OooO0Oo;

    public o000Oo0(MainActivity mainActivity) {
        this.f48293OooO0Oo = mainActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = MainActivity.f25394OooOoo;
        this.f48293OooO0Oo.OooOoO().loadUserInfo();
    }
}
