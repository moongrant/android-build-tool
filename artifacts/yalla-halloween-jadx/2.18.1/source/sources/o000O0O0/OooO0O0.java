package o000O0O0;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DisplayCutout f28103OooO00o;

    @RequiresApi(28)
    public static class OooO00o {
        @DoNotInline
        public static DisplayCutout OooO00o(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @DoNotInline
        public static List<Rect> OooO0O0(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @DoNotInline
        public static int OooO0OO(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @DoNotInline
        public static int OooO0Oo(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @DoNotInline
        public static int OooO0o(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        @DoNotInline
        public static int OooO0o0(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }
    }

    /* JADX INFO: renamed from: o000O0O0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @RequiresApi(30)
    public static class C0295OooO0O0 {
        @DoNotInline
        public static DisplayCutout OooO00o(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @DoNotInline
        public static Insets OooO0O0(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public OooO0O0(DisplayCutout displayCutout) {
        this.f28103OooO00o = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO0O0.class != obj.getClass()) {
            return false;
        }
        return o000OO0O.OooO0OO.OooO00o(this.f28103OooO00o, ((OooO0O0) obj).f28103OooO00o);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f28103OooO00o;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @NonNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DisplayCutoutCompat{");
        sbOooO0o0.append(this.f28103OooO00o);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
