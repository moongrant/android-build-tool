package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o000oOoO {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f5651OooO00o;

        public OooO00o(@NonNull ByteBuffer byteBuffer) {
            this.f5651OooO00o = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long OooO00o() throws IOException {
            return ((long) this.f5651OooO00o.getInt()) & 4294967295L;
        }

        public final void OooO0O0(int i) throws IOException {
            ByteBuffer byteBuffer = this.f5651OooO00o;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    public static p060o0000o0.o00O0O OooO00o(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long jOooO00o;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        OooO00o oooO00o = new OooO00o(byteBufferDuplicate);
        oooO00o.OooO0O0(4);
        int i = byteBufferDuplicate.getShort() & UShort.MAX_VALUE;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        oooO00o.OooO0O0(6);
        int i2 = 0;
        while (true) {
            byteBuffer = oooO00o.f5651OooO00o;
            if (i2 >= i) {
                jOooO00o = -1;
                break;
            }
            int i3 = byteBuffer.getInt();
            oooO00o.OooO0O0(4);
            jOooO00o = oooO00o.OooO00o();
            oooO00o.OooO0O0(4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (jOooO00o != -1) {
            oooO00o.OooO0O0((int) (jOooO00o - ((long) byteBufferDuplicate.position())));
            oooO00o.OooO0O0(12);
            long jOooO00o2 = oooO00o.OooO00o();
            for (int i4 = 0; i4 < jOooO00o2; i4++) {
                int i5 = byteBuffer.getInt();
                long jOooO00o3 = oooO00o.OooO00o();
                oooO00o.OooO00o();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (jOooO00o3 + jOooO00o));
                    p060o0000o0.o00O0O o00o0o2 = new p060o0000o0.o00O0O();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    o00o0o2.OooO0O0(byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position()), byteBufferDuplicate);
                    return o00o0o2;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
