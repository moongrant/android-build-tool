package o00OOO0O;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements o000OOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f37349OooO0O0;

    public OooO0o(@NonNull Object obj) {
        o0000O00.OooO0O0(obj);
        this.f37349OooO0O0 = obj;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f37349OooO0O0.toString().getBytes(o000OOo.f36731OooO00o));
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (obj instanceof OooO0o) {
            return this.f37349OooO0O0.equals(((OooO0o) obj).f37349OooO0O0);
        }
        return false;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return this.f37349OooO0O0.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f37349OooO0O0 + '}';
    }
}
