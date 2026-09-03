package p037OoooOo0;

import androidx.media3.ui.DefaultTimeBar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1522OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1523OooO0o0;

    public /* synthetic */ o000O(Object obj, int i) {
        this.f1522OooO0Oo = i;
        this.f1523OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1522OooO0Oo;
        Object obj = this.f1523OooO0o0;
        switch (i) {
            case 0:
                o00O0000 o00o0001 = (o00O0000) obj;
                if (!o00o0001.f1604OooOOOO) {
                    o00o0001.OooO0Oo();
                }
                break;
            default:
                int i2 = DefaultTimeBar.f6467OoooO0O;
                ((DefaultTimeBar) obj).OooO0o(false);
                break;
        }
    }
}
