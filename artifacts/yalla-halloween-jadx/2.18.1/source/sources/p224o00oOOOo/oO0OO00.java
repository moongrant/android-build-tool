package p224o00oOOOo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooO0OO;
import java.security.MessageDigest;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000OO;
import p219o00oO0O0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class oO0OO00 implements o00000OO<Drawable> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000OO<Bitmap> f33812OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f33813OooO0OO;

    public oO0OO00(o00000OO<Bitmap> o00000oo2, boolean z) {
        this.f33812OooO0O0 = o00000oo2;
        this.f33813OooO0OO = z;
    }

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        this.f33812OooO0O0.OooO00o(messageDigest);
    }

    @Override // p217o00oO00o.o00000OO
    @NonNull
    public final o00OOOO0<Drawable> OooO0O0(@NonNull Context context, @NonNull o00OOOO0<Drawable> o00oooo1, int i, int i2) {
        o0oOOo o0oooo2 = OooO0OO.OooO0O0(context).f12373Oooo0oO;
        Drawable drawable = o00oooo1.get();
        o00OOOO0<Bitmap> o00oooo0OooO00o = ooo0o.OooO00o(o0oooo2, drawable, i, i2);
        if (o00oooo0OooO00o != null) {
            o00OOOO0<Bitmap> o00oooo0OooO0O0 = this.f33812OooO0O0.OooO0O0(context, o00oooo0OooO00o, i, i2);
            if (!o00oooo0OooO0O0.equals(o00oooo0OooO00o)) {
                return oOo00o00.OooO0O0(context.getResources(), o00oooo0OooO0O0);
            }
            o00oooo0OooO0O0.OooO00o();
            return o00oooo1;
        }
        if (!this.f33813OooO0OO) {
            return o00oooo1;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (obj instanceof oO0OO00) {
            return this.f33812OooO0O0.equals(((oO0OO00) obj).f33812OooO0O0);
        }
        return false;
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return this.f33812OooO0O0.hashCode();
    }
}
