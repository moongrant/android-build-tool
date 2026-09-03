package o00OO0OO;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p127o00O0oo.o0000;
import p127o00O0oo.o00000O0;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO<T extends Drawable> implements o0000<T>, o00000O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final T f37259OooO0Oo;

    public OooOOO(T t) {
        o0000O00.OooO0O0(t);
        this.f37259OooO0Oo = t;
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Object get() {
        T t = this.f37259OooO0Oo;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }

    @Override // p127o00O0oo.o00000O0
    public void initialize() {
        T t = this.f37259OooO0Oo;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof p131o00OO0o.OooO) {
            ((p131o00OO0o.OooO) t).f37264OooO0Oo.f37274OooO00o.f37296OooOO0o.prepareToDraw();
        }
    }
}
