package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PointerIcon f5432OooO00o;

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

    public o00000OO(PointerIcon pointerIcon) {
        this.f5432OooO00o = pointerIcon;
    }
}
