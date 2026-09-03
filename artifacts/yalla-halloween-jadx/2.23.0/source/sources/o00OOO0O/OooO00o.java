package o00OOO0O;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements o000OOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37345OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OOo f37346OooO0OO;

    public OooO00o(int i, o000OOo o000ooo2) {
        this.f37345OooO0O0 = i;
        this.f37346OooO0OO = o000ooo2;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        this.f37346OooO0OO.OooO00o(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f37345OooO0O0).array());
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f37345OooO0O0 == oooO00o.f37345OooO0O0 && this.f37346OooO0OO.equals(oooO00o.f37346OooO0OO);
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return o0000oo.OooO0o(this.f37345OooO0O0, this.f37346OooO0OO);
    }
}
