package o000Oo0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO {
    public static long OooO00o(OooOOOO oooOOOO) {
        byte[] bArr = ((OooOo) oooOOOO).f34833OooO0O0.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
