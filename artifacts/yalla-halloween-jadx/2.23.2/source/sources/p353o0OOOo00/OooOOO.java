package p353o0OOOo00;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f42888OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Layout f42889OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f42890OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f42891OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO f42892OooO0o0;

    public OooOOO(TextView textView) {
        this.f42888OooO00o = textView;
    }

    public final void OooO00o() {
        OooO oooO = this.f42892OooO0o0;
        if (oooO == null || !oooO.isSelected()) {
            return;
        }
        oooO.OooO00o(false);
        this.f42892OooO0o0 = null;
        OooO0O0();
    }

    public final void OooO0O0() {
        float f = this.f42890OooO0OO;
        this.f42888OooO00o.invalidate((int) f, (int) this.f42891OooO0Oo, this.f42889OooO0O0.getWidth() + ((int) f), this.f42889OooO0O0.getHeight() + ((int) this.f42891OooO0Oo));
    }
}
