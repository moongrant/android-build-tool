package p127o00O0oo;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p126o00O0oOo.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o000OOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo f36936OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OOo f36937OooO0OO;

    public oo000o(o000OOo o000ooo2, o000OOo o000ooo3) {
        this.f36936OooO0O0 = o000ooo2;
        this.f36937OooO0OO = o000ooo3;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        this.f36936OooO0O0.OooO00o(messageDigest);
        this.f36937OooO0OO.OooO00o(messageDigest);
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof oo000o)) {
            return false;
        }
        oo000o oo000oVar = (oo000o) obj;
        return this.f36936OooO0O0.equals(oo000oVar.f36936OooO0O0) && this.f36937OooO0OO.equals(oo000oVar.f36937OooO0OO);
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return this.f36937OooO0OO.hashCode() + (this.f36936OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f36936OooO0O0 + ", signature=" + this.f36937OooO0OO + '}';
    }
}
