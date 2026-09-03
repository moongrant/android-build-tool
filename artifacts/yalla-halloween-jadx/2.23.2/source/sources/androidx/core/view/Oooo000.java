package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DisplayCutout f5340OooO00o;

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

    @RequiresApi(30)
    public static class OooO0O0 {
        @DoNotInline
        public static DisplayCutout OooO00o(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @DoNotInline
        public static Insets OooO0O0(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public Oooo000(DisplayCutout displayCutout) {
        this.f5340OooO00o = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Oooo000.class != obj.getClass()) {
            return false;
        }
        return o000OO.OooO0OO.OooO00o(this.f5340OooO00o, ((Oooo000) obj).f5340OooO00o);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f5340OooO00o;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @NonNull
    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5340OooO00o + "}";
    }
}
