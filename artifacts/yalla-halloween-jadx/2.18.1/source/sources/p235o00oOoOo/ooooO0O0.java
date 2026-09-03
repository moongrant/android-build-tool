package p235o00oOoOo;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p234o00oOoOO.oOO0O0O0;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public abstract class ooooO0O0<T> implements oOOO0O0o<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f34025Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f34026Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public oOO0O0O0 f34027Oooo0oo;

    public ooooO0O0(int i, int i2) {
        if (!o000O000.OooOO0(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f34025Oooo0o = Integer.MIN_VALUE;
        this.f34026Oooo0oO = Integer.MIN_VALUE;
    }

    @Override // p235o00oOoOo.oOOO0O0o
    @Nullable
    public final oOO0O0O0 getRequest() {
        return this.f34027Oooo0oo;
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public final void getSize(@NonNull oOOO00o0 oooo00o0) {
        oooo00o0.OooO0O0(this.f34025Oooo0o, this.f34026Oooo0oO);
    }

    @Override // p231o00oOo0o.o0OO00O
    public final void onDestroy() {
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public final void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // p231o00oOo0o.o0OO00O
    public final void onStart() {
    }

    @Override // p231o00oOo0o.o0OO00O
    public final void onStop() {
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public final void removeCallback(@NonNull oOOO00o0 oooo00o0) {
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public final void setRequest(@Nullable oOO0O0O0 ooo0o0o0) {
        this.f34027Oooo0oo = ooo0o0o0;
    }
}
