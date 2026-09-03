package p160o00OoOOO;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooO;
import com.bumptech.glide.OooO0OO;
import java.security.MessageDigest;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o000000;
import p156o00OoO00.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o000000<Drawable> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000<Bitmap> f38094OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f38095OooO0OO;

    public oo0o0Oo(o000000<Bitmap> o000000Var, boolean z) {
        this.f38094OooO0O0 = o000000Var;
        this.f38095OooO0OO = z;
    }

    @Override // p154o00Oo0oo.o000000
    @NonNull
    public final o00oOoo OooO00o(@NonNull OooO oooO, @NonNull o00oOoo o00oooo2, int i, int i2) {
        OooOO0 oooOO1 = OooO0OO.OooO0O0(oooO).f12944OooO0o0;
        Drawable drawable = (Drawable) o00oooo2.get();
        o00Ooo o00oooOooO00o = o0OO00O.OooO00o(oooOO1, drawable, i, i2);
        if (o00oooOooO00o != null) {
            o00oOoo o00ooooOooO00o = this.f38094OooO0O0.OooO00o(oooO, o00oooOooO00o, i, i2);
            if (!o00ooooOooO00o.equals(o00oooOooO00o)) {
                return new o00000(oooO.getResources(), o00ooooOooO00o);
            }
            o00ooooOooO00o.OooO00o();
            return o00oooo2;
        }
        if (!this.f38095OooO0OO) {
            return o00oooo2;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        this.f38094OooO0O0.OooO0O0(messageDigest);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (obj instanceof oo0o0Oo) {
            return this.f38094OooO0O0.equals(((oo0o0Oo) obj).f38094OooO0O0);
        }
        return false;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return this.f38094OooO0O0.hashCode();
    }
}
