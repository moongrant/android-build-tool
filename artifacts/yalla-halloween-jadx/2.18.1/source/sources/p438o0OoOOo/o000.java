package p438o0OoOOo;

import android.text.Layout;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f40093OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Layout f40094OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f40095OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f40096OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000OO f40097OooO0o0;

    public o000(View view) {
        this.f40093OooO00o = view;
    }

    public final void OooO00o() {
        o000OO o000oo2 = this.f40097OooO0o0;
        if (o000oo2 == null || !o000oo2.isSelected()) {
            return;
        }
        o000oo2.OooO00o(false);
        this.f40097OooO0o0 = null;
        OooO0O0();
    }

    public final void OooO0O0() {
        View view = this.f40093OooO00o;
        float f = this.f40095OooO0OO;
        view.invalidate((int) f, (int) this.f40096OooO0Oo, this.f40094OooO0O0.getWidth() + ((int) f), this.f40094OooO0O0.getHeight() + ((int) this.f40096OooO0Oo));
    }
}
