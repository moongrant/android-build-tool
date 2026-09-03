package androidx.compose.ui.platform;

import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4176OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4177OooO0o0;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f4176OooO0Oo = i;
        this.f4177OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4176OooO0Oo;
        Object obj = this.f4177OooO0o0;
        switch (i) {
            case 0:
                AndroidComposeView.sendHoverExitEvent$lambda$5((AndroidComposeView) obj);
                break;
            default:
                SideSheetBehavior.OooO0O0 oooO0O0 = (SideSheetBehavior.OooO0O0) obj;
                oooO0O0.f17702OooO0O0 = false;
                SideSheetBehavior sideSheetBehavior = oooO0O0.f17704OooO0Oo;
                p056o0000Oo0.OooO0o oooO0o = sideSheetBehavior.f17679OooO;
                if (oooO0o != null && oooO0o.OooO0oo()) {
                    oooO0O0.OooO00o(oooO0O0.f17701OooO00o);
                } else if (sideSheetBehavior.f17687OooO0oo == 2) {
                    sideSheetBehavior.OooOo00(oooO0O0.f17701OooO00o);
                }
                break;
        }
    }
}
