package p438o0OoOo00;

import androidx.lifecycle.Observer;
import oO0OO.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f46095OooO0Oo;

    public oo0o0Oo(o0O0O00 o0o0o00) {
        this.f46095OooO0Oo = o0o0o00;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        OooO0o oooO0o = this.f46095OooO0Oo.f46093OooO0O0;
        if (oooO0o != null) {
            oooO0o.dismiss();
        }
    }
}
