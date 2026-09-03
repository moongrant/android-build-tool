package p144o00Oo;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p154o00Oo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements o0OOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f37554OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOO0o f37555OooO0OO;

    public o0000OO0(o0OOO0o o0ooo0o2, o0OOO0o o0ooo0o3) {
        this.f37554OooO0O0 = o0ooo0o2;
        this.f37555OooO0OO = o0ooo0o3;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        this.f37554OooO0O0.OooO0O0(messageDigest);
        this.f37555OooO0OO.OooO0O0(messageDigest);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (!(obj instanceof o0000OO0)) {
            return false;
        }
        o0000OO0 o0000oo1 = (o0000OO0) obj;
        return this.f37554OooO0O0.equals(o0000oo1.f37554OooO0O0) && this.f37555OooO0OO.equals(o0000oo1.f37555OooO0OO);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return this.f37555OooO0OO.hashCode() + (this.f37554OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f37554OooO0O0 + ", signature=" + this.f37555OooO0OO + '}';
    }
}
