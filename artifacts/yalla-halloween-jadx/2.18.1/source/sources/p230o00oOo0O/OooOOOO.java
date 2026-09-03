package p230o00oOo0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p226o00oOOo0.o0oOOo;
import p238o00oOooO.oOOOOo0O;
import p243o00oo00O.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements OooOo00<oOOOOo0O, byte[]> {
    @Override // p230o00oOo0O.OooOo00
    @Nullable
    public final o00OOOO0<byte[]> OooO00o(@NonNull o00OOOO0<oOOOOo0O> o00oooo1, @NonNull o00000 o00000Var) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = o00oooo1.get().f34071Oooo0o.f34081OooO00o.f34087OooO00o.OooO0o0().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = o0000Ooo.f34168OooO00o;
        o0000Ooo.OooO0O0 oooO0O0 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new o0000Ooo.OooO0O0(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (oooO0O0 != null && oooO0O0.f34171OooO00o == 0 && oooO0O0.f34172OooO0O0 == oooO0O0.f34173OooO0OO.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.position(0);
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new o0oOOo(bArrArray);
    }
}
