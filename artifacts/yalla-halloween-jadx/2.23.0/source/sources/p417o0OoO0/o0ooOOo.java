package p417o0OoO0;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f45529OooO00o = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f45530OooO0O0 = Resources.getSystem().getDisplayMetrics().heightPixels;

    public static final int OooO00o() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }
}
