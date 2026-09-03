package p230o00oOo0O;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p219o00oO0O0.o0oOOo;
import p224o00oOOOo.oO0O0O0o;
import p238o00oOooO.oOOOOo0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements OooOo00<Drawable, byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oOOo f33899OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00<Bitmap, byte[]> f33900OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo00<oOOOOo0O, byte[]> f33901OooO0OO;

    public OooOOO(@NonNull o0oOOo o0oooo2, @NonNull OooOo00<Bitmap, byte[]> oooOo00, @NonNull OooOo00<oOOOOo0O, byte[]> oooOo01) {
        this.f33899OooO00o = o0oooo2;
        this.f33900OooO0O0 = oooOo00;
        this.f33901OooO0OO = oooOo01;
    }

    @Override // p230o00oOo0O.OooOo00
    @Nullable
    public final o00OOOO0<byte[]> OooO00o(@NonNull o00OOOO0<Drawable> o00oooo1, @NonNull o00000 o00000Var) {
        Drawable drawable = o00oooo1.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f33900OooO0O0.OooO00o(oO0O0O0o.OooO0O0(((BitmapDrawable) drawable).getBitmap(), this.f33899OooO00o), o00000Var);
        }
        if (drawable instanceof oOOOOo0O) {
            return this.f33901OooO0OO.OooO00o(o00oooo1, o00000Var);
        }
        return null;
    }
}
