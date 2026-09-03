package p486o0o00O00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48283OooO0Oo;

    public o000O00O(MainActivity mainActivity) {
        this.f48283OooO0Oo = mainActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (obj instanceof MainActivity) {
            return;
        }
        int i = MainActivity.f25394OooOoo;
        this.f48283OooO0Oo.OooOo().f58660OooO0oO.OooO00o();
    }
}
