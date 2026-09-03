package androidx.compose.ui.graphics;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0o0Oo {
    public static long OooO00o(p246o00oo0o0.o000OOo0 o000ooo1) {
        byte[] bArr = ((p246o00oo0o0.o00O0000) o000ooo1).f40728OooO0O0.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static float OooO0O0(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }
}
