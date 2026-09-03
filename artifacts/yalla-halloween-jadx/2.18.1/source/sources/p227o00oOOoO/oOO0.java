package p227o00oOOoO;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class oOO0 extends ooooO000<Drawable> {
    public oOO0(Drawable drawable) {
        super(drawable);
    }

    @Override // p214o00oO0.o00OOOO0
    public final void OooO00o() {
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Class<Drawable> OooO0OO() {
        return this.f33879Oooo0o.getClass();
    }

    @Override // p214o00oO0.o00OOOO0
    public final int getSize() {
        return Math.max(1, this.f33879Oooo0o.getIntrinsicHeight() * this.f33879Oooo0o.getIntrinsicWidth() * 4);
    }
}
