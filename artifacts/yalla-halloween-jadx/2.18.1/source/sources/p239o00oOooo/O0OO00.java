package p239o00oOooo;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p217o00oO00o.o000000;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class O0OO00 implements o000000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34108OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000000 f34109OooO0OO;

    public O0OO00(int i, o000000 o000000Var) {
        this.f34108OooO0O0 = i;
        this.f34109OooO0OO = o000000Var;
    }

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        this.f34109OooO0OO.OooO00o(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f34108OooO0O0).array());
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (!(obj instanceof O0OO00)) {
            return false;
        }
        O0OO00 o0oo00 = (O0OO00) obj;
        return this.f34108OooO0O0 == o0oo00.f34108OooO0O0 && this.f34109OooO0OO.equals(o0oo00.f34109OooO0OO);
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return o000O000.OooO0oO(this.f34109OooO0OO, this.f34108OooO0O0);
    }
}
