package p168o00Ooo00;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.oo0o0Oo;
import p161o00OoOOo.o0000O;
import p165o00OoOoo.o00;
import p174o00OooOo.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements oo000o<o00, byte[]> {
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @Override // p168o00Ooo00.oo000o
    @Nullable
    public final o00oOoo<byte[]> OooO00o(@NonNull o00oOoo<o00> o00oooo2, @NonNull oo0o0Oo oo0o0oo) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = o00oooo2.get().f38157OooO0Oo.f38167OooO00o.f38181OooO00o.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = o00O0.f38332OooO00o;
        o00O0.OooO0O0 oooO0O0 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new o00O0.OooO0O0(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (oooO0O0 == null || oooO0O0.f38335OooO00o != 0) {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        } else {
            if (oooO0O0.f38336OooO0O0 == oooO0O0.f38337OooO0OO.length) {
                bArrArray = byteBufferAsReadOnlyBuffer.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                byteBufferAsReadOnlyBuffer3.get(bArr2);
                bArrArray = bArr2;
            }
        }
        return new o0000O(bArrArray);
    }
}
