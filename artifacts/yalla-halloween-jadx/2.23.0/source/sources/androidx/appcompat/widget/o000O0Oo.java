package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p018OooOoo0.OooOO0O f3271OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OO0O f3272OooO0o0;

    public o000O0Oo(o000OO0O o000oo0o2) {
        this.f3272OooO0o0 = o000oo0o2;
        this.f3271OooO0Oo = new p018OooOoo0.OooOO0O(o000oo0o2.f3295OooO00o.getContext(), o000oo0o2.f3294OooO);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o000OO0O o000oo0o2 = this.f3272OooO0o0;
        Window.Callback callback = o000oo0o2.f3305OooOO0o;
        if (callback == null || !o000oo0o2.f3307OooOOO0) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3271OooO0Oo);
    }
}
