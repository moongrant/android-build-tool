package p071o000O0o;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import o000OO0O.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<OooO0o<Rect, Rect>> f28167OooO00o = new ThreadLocal<>();

    @RequiresApi(23)
    public static class OooO00o {
        @DoNotInline
        public static boolean OooO00o(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }
}
