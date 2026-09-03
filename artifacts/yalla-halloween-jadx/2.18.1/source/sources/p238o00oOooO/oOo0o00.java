package p238o00oOooO;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooO0OO;
import java.security.MessageDigest;
import java.util.Objects;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000OO;
import p224o00oOOOo.oO0O0O0o;

/* JADX INFO: loaded from: classes.dex */
public final class oOo0o00 implements o00000OO<oOOOOo0O> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000OO<Bitmap> f34084OooO0O0;

    public oOo0o00(o00000OO<Bitmap> o00000oo2) {
        Objects.requireNonNull(o00000oo2, "Argument must not be null");
        this.f34084OooO0O0 = o00000oo2;
    }

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        this.f34084OooO0O0.OooO00o(messageDigest);
    }

    @Override // p217o00oO00o.o00000OO
    @NonNull
    public final o00OOOO0<oOOOOo0O> OooO0O0(@NonNull Context context, @NonNull o00OOOO0<oOOOOo0O> o00oooo1, int i, int i2) {
        oOOOOo0O oooooo0o = o00oooo1.get();
        o00OOOO0<Bitmap> oo0o0o0o = new oO0O0O0o(oooooo0o.OooO0O0(), OooO0OO.OooO0O0(context).f12373Oooo0oO);
        o00OOOO0<Bitmap> o00oooo0OooO0O0 = this.f34084OooO0O0.OooO0O0(context, oo0o0o0o, i, i2);
        if (!oo0o0o0o.equals(o00oooo0OooO0O0)) {
            oo0o0o0o.OooO00o();
        }
        Bitmap bitmap = o00oooo0OooO0O0.get();
        oooooo0o.f34071Oooo0o.f34081OooO00o.OooO0OO(this.f34084OooO0O0, bitmap);
        return o00oooo1;
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (obj instanceof oOo0o00) {
            return this.f34084OooO0O0.equals(((oOo0o00) obj).f34084OooO0O0);
        }
        return false;
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return this.f34084OooO0O0.hashCode();
    }
}
