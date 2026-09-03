package o000O0O0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PointerIcon f28134OooO00o;

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static PointerIcon OooO00o(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        @DoNotInline
        public static PointerIcon OooO0O0(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        @DoNotInline
        public static PointerIcon OooO0OO(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public o0Oo0oo(PointerIcon pointerIcon) {
        this.f28134OooO00o = pointerIcon;
    }

    @NonNull
    public static o0Oo0oo OooO00o(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 24 ? new o0Oo0oo(OooO00o.OooO0O0(context, 1002)) : new o0Oo0oo(null);
    }
}
