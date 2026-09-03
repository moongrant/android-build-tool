package p163o00OoOo0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p144o00Oo.o000OOo0;
import p144o00Oo.o00oOoo;
import p165o00OoOoo.o00;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0OOO0o<T extends Drawable> implements o00oOoo<T>, o000OOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final T f38106OooO0Oo;

    public o0OOO0o(T t) {
        o00OO00O.OooO0O0(t);
        this.f38106OooO0Oo = t;
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Object get() {
        T t = this.f38106OooO0Oo;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }

    @Override // p144o00Oo.o000OOo0
    public void initialize() {
        T t = this.f38106OooO0Oo;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof o00) {
            ((o00) t).f38157OooO0Oo.f38167OooO00o.f38191OooOO0o.prepareToDraw();
        }
    }
}
