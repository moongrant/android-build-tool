package o000O0O0;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000000 {
    @DoNotInline
    public static int OooO00o(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    @DoNotInline
    public static boolean OooO0O0(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    @DoNotInline
    public static void OooO0OO(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }
}
