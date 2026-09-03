package o00OO0O0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p126o00O0oOo.o00000OO;
import p127o00O0oo.o0000;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o00000OO<Drawable> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000OO<Bitmap> f37223OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f37224OooO0OO;

    public o000oOoO(o00000OO<Bitmap> o00000oo2, boolean z) {
        this.f37223OooO0O0 = o00000oo2;
        this.f37224OooO0OO = z;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        this.f37223OooO0O0.OooO00o(messageDigest);
    }

    @Override // p126o00O0oOo.o00000OO
    @NonNull
    public final o0000 OooO0O0(@NonNull com.bumptech.glide.OooO oooO, @NonNull o0000 o0000Var, int i, int i2) {
        o0000oo o0000ooVar = com.bumptech.glide.OooO0OO.OooO0O0(oooO).f9853OooO0o0;
        Drawable drawable = (Drawable) o0000Var.get();
        OooOOO0 oooOOO0OooO00o = Oooo0.OooO00o(o0000ooVar, drawable, i, i2);
        if (oooOOO0OooO00o != null) {
            o0000 o0000VarOooO0O0 = this.f37223OooO0O0.OooO0O0(oooO, oooOOO0OooO00o, i, i2);
            if (!o0000VarOooO0O0.equals(oooOOO0OooO00o)) {
                return new oo000o(oooO.getResources(), o0000VarOooO0O0);
            }
            o0000VarOooO0O0.OooO00o();
            return o0000Var;
        }
        if (!this.f37224OooO0OO) {
            return o0000Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (obj instanceof o000oOoO) {
            return this.f37223OooO0O0.equals(((o000oOoO) obj).f37223OooO0O0);
        }
        return false;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return this.f37223OooO0O0.hashCode();
    }
}
