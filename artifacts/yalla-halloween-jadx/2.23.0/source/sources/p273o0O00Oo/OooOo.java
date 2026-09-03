package p273o0O00Oo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import p273o0O00Oo.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooOo<S extends OooO0OO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final S f41733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOo00 f41734OooO0O0;

    public OooOo(S s) {
        this.f41733OooO00o = s;
    }

    public abstract void OooO00o(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f);

    public abstract void OooO0O0(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @ColorInt int i);

    public abstract void OooO0OO(@NonNull Canvas canvas, @NonNull Paint paint);

    public abstract int OooO0Oo();

    public abstract int OooO0o0();
}
