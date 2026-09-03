package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 {
    public static int OooO00o(RecyclerView.o0OOO0o o0ooo0o2, o000OOo o000ooo2, View view, View view2, RecyclerView.Oooo000 oooo000, boolean z) {
        if (oooo000.getChildCount() == 0 || o0ooo0o2.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oooo000.getPosition(view) - oooo000.getPosition(view2)) + 1;
        }
        return Math.min(o000ooo2.OooOO0o(), o000ooo2.OooO0O0(view2) - o000ooo2.OooO0o0(view));
    }

    public static int OooO0O0(RecyclerView.o0OOO0o o0ooo0o2, o000OOo o000ooo2, View view, View view2, RecyclerView.Oooo000 oooo000, boolean z, boolean z2) {
        if (oooo000.getChildCount() == 0 || o0ooo0o2.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (o0ooo0o2.OooO0O0() - Math.max(oooo000.getPosition(view), oooo000.getPosition(view2))) - 1) : Math.max(0, Math.min(oooo000.getPosition(view), oooo000.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(o000ooo2.OooO0O0(view2) - o000ooo2.OooO0o0(view)) / (Math.abs(oooo000.getPosition(view) - oooo000.getPosition(view2)) + 1))) + (o000ooo2.OooOO0O() - o000ooo2.OooO0o0(view)));
        }
        return iMax;
    }

    public static int OooO0OO(RecyclerView.o0OOO0o o0ooo0o2, o000OOo o000ooo2, View view, View view2, RecyclerView.Oooo000 oooo000, boolean z) {
        if (oooo000.getChildCount() == 0 || o0ooo0o2.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return o0ooo0o2.OooO0O0();
        }
        return (int) (((o000ooo2.OooO0O0(view2) - o000ooo2.OooO0o0(view)) / (Math.abs(oooo000.getPosition(view) - oooo000.getPosition(view2)) + 1)) * o0ooo0o2.OooO0O0());
    }
}
