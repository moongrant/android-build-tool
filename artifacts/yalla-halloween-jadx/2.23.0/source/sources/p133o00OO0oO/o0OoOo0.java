package p133o00OO0oO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import o00OO0O.OooO0O0;
import p126o00O0oOo.o00000;
import p127o00O0oo.o0000;
import p131o00OO0o.OooO;
import p532o0o0Oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements o00O0O<OooO, byte[]> {
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @Override // p133o00OO0oO.o00O0O
    @Nullable
    public final o0000<byte[]> OooO00o(@NonNull o0000<OooO> o0000Var, @NonNull o00000 o00000Var) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = o0000Var.get().f37264OooO0Oo.f37274OooO00o.f37286OooO00o.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = oo0o0Oo.f54578OooO00o;
        oo0o0Oo.OooO0O0 oooO0O0 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new oo0o0Oo.OooO0O0(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (oooO0O0 == null || oooO0O0.f54581OooO00o != 0) {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        } else {
            if (oooO0O0.f54582OooO0O0 == oooO0O0.f54583OooO0OO.length) {
                bArrArray = byteBufferAsReadOnlyBuffer.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                byteBufferAsReadOnlyBuffer3.get(bArr2);
                bArrArray = bArr2;
            }
        }
        return new OooO0O0(bArrArray);
    }
}
