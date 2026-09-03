package p227o00oOOoO;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.Objects;
import p214o00oO0.o00OOO00;
import p214o00oO0.o00OOOO0;
import p238o00oOooO.oOOOOo0O;

/* JADX INFO: loaded from: classes.dex */
public abstract class ooooO000<T extends Drawable> implements o00OOOO0<T>, o00OOO00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final T f33879Oooo0o;

    public ooooO000(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f33879Oooo0o = t;
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Object get() {
        Drawable.ConstantState constantState = this.f33879Oooo0o.getConstantState();
        return constantState == null ? this.f33879Oooo0o : constantState.newDrawable();
    }

    @Override // p214o00oO0.o00OOO00
    public void initialize() {
        T t = this.f33879Oooo0o;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof oOOOOo0O) {
            ((oOOOOo0O) t).OooO0O0().prepareToDraw();
        }
    }
}
