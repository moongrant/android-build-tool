package p173o00OooOO;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p154o00Oo0oo.o0OOO0o;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O implements o0OOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38328OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOO0o f38329OooO0OO;

    public oOO00O(int i, o0OOO0o o0ooo0o2) {
        this.f38328OooO0O0 = i;
        this.f38329OooO0OO = o0ooo0o2;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        this.f38329OooO0OO.OooO0O0(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f38328OooO0O0).array());
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (!(obj instanceof oOO00O)) {
            return false;
        }
        oOO00O ooo00o = (oOO00O) obj;
        return this.f38328OooO0O0 == ooo00o.f38328OooO0O0 && this.f38329OooO0OO.equals(ooo00o.f38329OooO0OO);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return o00OO0O0.OooO0o(this.f38328OooO0O0, this.f38329OooO0OO);
    }
}
