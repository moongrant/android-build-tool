package androidx.appcompat.widget;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3270OooO0o0;

    public /* synthetic */ o000O00O(Object obj, int i) {
        this.f3269OooO0Oo = i;
        this.f3270OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3269OooO0Oo;
        Object obj = this.f3270OooO0o0;
        switch (i) {
            case 0:
                Toolbar.OooOO0 oooOO1 = ((Toolbar) obj).f3154Oooo;
                androidx.appcompat.view.menu.OooOO0O oooOO0O = oooOO1 == null ? null : oooOO1.f3179OooO0o0;
                if (oooOO0O != null) {
                    oooOO0O.collapseActionView();
                    return;
                }
                return;
            case 1:
                p045Oooooo.o0000Ooo o0000ooo = (p045Oooooo.o0000Ooo) obj;
                Range<Long> range = p045Oooooo.o0000Ooo.f1896OooOooO;
                o0000ooo.getClass();
                int i2 = Oooooo.o0000Ooo.OooO00o.f1939OooO00o[o0000ooo.f1918OooOo00.ordinal()];
                if (i2 == 2) {
                    o0000ooo.OooO();
                    return;
                } else {
                    if (i2 == 7 || i2 == 9) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            default:
                com.google.android.material.textfield.o00Oo0 o00oo1 = (com.google.android.material.textfield.o00Oo0) obj;
                boolean zIsPopupShowing = o00oo1.f18068OooO0oo.isPopupShowing();
                o00oo1.OooOo00(zIsPopupShowing);
                o00oo1.f18073OooOOO0 = zIsPopupShowing;
                return;
        }
    }
}
