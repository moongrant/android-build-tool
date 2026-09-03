package p165o00OoOoo;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooO;
import com.bumptech.glide.OooO0OO;
import java.security.MessageDigest;
import p154o00Oo0oo.o000000;
import p160o00OoOOO.o00Ooo;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo implements o000000<o00> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000<Bitmap> f38206OooO0O0;

    public o00oOoo(o000000<Bitmap> o000000Var) {
        o00OO00O.OooO0O0(o000000Var);
        this.f38206OooO0O0 = o000000Var;
    }

    @Override // p154o00Oo0oo.o000000
    @NonNull
    public final p144o00Oo.o00oOoo OooO00o(@NonNull OooO oooO, @NonNull p144o00Oo.o00oOoo o00oooo2, int i, int i2) {
        o00 o00Var = (o00) o00oooo2.get();
        o00Ooo o00ooo2 = new o00Ooo(o00Var.f38157OooO0Oo.f38167OooO00o.f38191OooOO0o, OooO0OO.OooO0O0(oooO).f12944OooO0o0);
        o000000<Bitmap> o000000Var = this.f38206OooO0O0;
        p144o00Oo.o00oOoo o00ooooOooO00o = o000000Var.OooO00o(oooO, o00ooo2, i, i2);
        if (!o00ooo2.equals(o00ooooOooO00o)) {
            o00ooo2.OooO00o();
        }
        o00Var.f38157OooO0Oo.f38167OooO00o.OooO0OO(o000000Var, (Bitmap) o00ooooOooO00o.get());
        return o00oooo2;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        this.f38206OooO0O0.OooO0O0(messageDigest);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (obj instanceof o00oOoo) {
            return this.f38206OooO0O0.equals(((o00oOoo) obj).f38206OooO0O0);
        }
        return false;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return this.f38206OooO0O0.hashCode();
    }
}
