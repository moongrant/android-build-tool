package p347o0OOOOoo;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f43680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Layout f43681OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f43682OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f43683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000oOoO f43684OooO0o0;

    public o00Ooo(TextView textView) {
        this.f43680OooO00o = textView;
    }

    public final void OooO00o() {
        o000oOoO o000oooo2 = this.f43684OooO0o0;
        if (o000oooo2 == null || !o000oooo2.isSelected()) {
            return;
        }
        o000oooo2.OooO00o(false);
        this.f43684OooO0o0 = null;
        OooO0O0();
    }

    public final void OooO0O0() {
        float f = this.f43682OooO0OO;
        this.f43680OooO00o.invalidate((int) f, (int) this.f43683OooO0Oo, this.f43681OooO0O0.getWidth() + ((int) f), this.f43681OooO0O0.getHeight() + ((int) this.f43683OooO0Oo));
    }
}
