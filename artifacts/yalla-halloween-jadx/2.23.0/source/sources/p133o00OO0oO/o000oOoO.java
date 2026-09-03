package p133o00OO0oO;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00OO0O0.OooOOO0;
import p126o00O0oOo.o00000;
import p127o00O0oo.o0000;
import p129o00O0ooo.o0000oo;
import p131o00OO0o.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o00O0O<Drawable, byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f37318OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O<Bitmap, byte[]> f37319OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O<OooO, byte[]> f37320OooO0OO;

    public o000oOoO(@NonNull o0000oo o0000ooVar, @NonNull Oooo000 oooo000, @NonNull o0OoOo0 o0oooo0) {
        this.f37318OooO00o = o0000ooVar;
        this.f37319OooO0O0 = oooo000;
        this.f37320OooO0OO = o0oooo0;
    }

    @Override // p133o00OO0oO.o00O0O
    @Nullable
    public final o0000<byte[]> OooO00o(@NonNull o0000<Drawable> o0000Var, @NonNull o00000 o00000Var) {
        Drawable drawable = o0000Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f37319OooO0O0.OooO00o(OooOOO0.OooO0OO(((BitmapDrawable) drawable).getBitmap(), this.f37318OooO00o), o00000Var);
        }
        if (drawable instanceof OooO) {
            return this.f37320OooO0OO.OooO00o(o0000Var, o00000Var);
        }
        return null;
    }
}
