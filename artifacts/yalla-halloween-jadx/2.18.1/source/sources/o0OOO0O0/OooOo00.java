package o0OOO0O0;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import o0OOO0O0.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOo00<S extends OooO0O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public S f38098OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOOO f38099OooO0O0;

    public OooOo00(S s) {
        this.f38098OooO00o = s;
    }

    public abstract void OooO00o(@NonNull Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f);

    public abstract void OooO0O0(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @ColorInt int i);

    public abstract void OooO0OO(@NonNull Canvas canvas, @NonNull Paint paint);

    public abstract int OooO0Oo();

    public abstract int OooO0o0();
}
