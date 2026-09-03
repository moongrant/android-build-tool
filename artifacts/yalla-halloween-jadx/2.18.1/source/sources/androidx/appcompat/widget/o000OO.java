package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final p015OooOoO.Oooo000 f5391Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000O f5392Oooo0oO;

    public o000OO(o0000O o0000o2) {
        this.f5392Oooo0oO = o0000o2;
        this.f5391Oooo0o = new p015OooOoO.Oooo000(o0000o2.f5348OooO00o.getContext(), o0000o2.f5347OooO);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o0000O o0000o2 = this.f5392Oooo0oO;
        Window.Callback callback = o0000o2.f5358OooOO0o;
        if (callback == null || !o0000o2.f5360OooOOO0) {
            return;
        }
        callback.onMenuItemSelected(0, this.f5391Oooo0o);
    }
}
