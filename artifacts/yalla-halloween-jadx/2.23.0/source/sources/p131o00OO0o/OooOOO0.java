package p131o00OO0o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooO;
import com.bumptech.glide.OooO0OO;
import java.security.MessageDigest;
import p126o00O0oOo.o00000OO;
import p127o00O0oo.o0000;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements o00000OO<OooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000OO<Bitmap> f37307OooO0O0;

    public OooOOO0(o00000OO<Bitmap> o00000oo2) {
        o0000O00.OooO0O0(o00000oo2);
        this.f37307OooO0O0 = o00000oo2;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        this.f37307OooO0O0.OooO00o(messageDigest);
    }

    @Override // p126o00O0oOo.o00000OO
    @NonNull
    public final o0000 OooO0O0(@NonNull OooO oooO, @NonNull o0000 o0000Var, int i, int i2) {
        OooO oooO2 = (OooO) o0000Var.get();
        o00OO0O0.OooOOO0 oooOOO0 = new o00OO0O0.OooOOO0(oooO2.f37264OooO0Oo.f37274OooO00o.f37296OooOO0o, OooO0OO.OooO0O0(oooO).f9853OooO0o0);
        o00000OO<Bitmap> o00000oo2 = this.f37307OooO0O0;
        o0000 o0000VarOooO0O0 = o00000oo2.OooO0O0(oooO, oooOOO0, i, i2);
        if (!oooOOO0.equals(o0000VarOooO0O0)) {
            oooOOO0.OooO00o();
        }
        oooO2.f37264OooO0Oo.f37274OooO00o.OooO0OO(o00000oo2, (Bitmap) o0000VarOooO0O0.get());
        return o0000Var;
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (obj instanceof OooOOO0) {
            return this.f37307OooO0O0.equals(((OooOOO0) obj).f37307OooO0O0);
        }
        return false;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return this.f37307OooO0O0.hashCode();
    }
}
