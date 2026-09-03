package androidx.media3.ui;

import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OoOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9907OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9908OooO0o0;

    public /* synthetic */ o0OoOo0(Object obj, int i) {
        this.f9907OooO0Oo = i;
        this.f9908OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9907OooO0Oo;
        Object obj = this.f9908OooO0o0;
        switch (i) {
            case 0:
                ((o0O0O00) obj).OooOO0O();
                break;
            default:
                SideSheetBehavior.OooO0O0 oooO0O0 = (SideSheetBehavior.OooO0O0) obj;
                oooO0O0.f17230OooO0O0 = false;
                SideSheetBehavior sideSheetBehavior = oooO0O0.f17232OooO0Oo;
                p056o0000Oo0.OooO0o oooO0o = sideSheetBehavior.f17207OooO;
                if (oooO0o != null && oooO0o.OooO0oo()) {
                    oooO0O0.OooO00o(oooO0O0.f17229OooO00o);
                } else if (sideSheetBehavior.f17215OooO0oo == 2) {
                    sideSheetBehavior.OooOo00(oooO0O0.f17229OooO00o);
                }
                break;
        }
    }
}
