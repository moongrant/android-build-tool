package o000O0O0;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import net.sqlcipher.database.SQLiteDatabase;
import org.jctools.util.Pow2;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends DecoderInputBuffer {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f34208OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f34209OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f34210OooOOO0;

    public OooOOO() {
        super(2);
        this.f34209OooOOO = 32;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer
    public final void OooO0oo() {
        super.OooO0oo();
        this.f34210OooOOO0 = 0;
    }

    public final boolean OooOO0o(DecoderInputBuffer decoderInputBuffer) {
        boolean z;
        ByteBuffer byteBuffer;
        o00Oo0.OooO00o(!decoderInputBuffer.OooO0o(Pow2.MAX_POW2));
        o00Oo0.OooO00o(!decoderInputBuffer.OooO0o(SQLiteDatabase.CREATE_IF_NECESSARY));
        o00Oo0.OooO00o(!decoderInputBuffer.OooO0o(4));
        int i = this.f34210OooOOO0;
        if (i > 0) {
            if (i < this.f34209OooOOO && decoderInputBuffer.OooO0oO() == OooO0oO()) {
                ByteBuffer byteBuffer2 = decoderInputBuffer.f7084OooO0o;
                if (byteBuffer2 != null && (byteBuffer = this.f7084OooO0o) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    }
                }
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        int i2 = this.f34210OooOOO0;
        this.f34210OooOOO0 = i2 + 1;
        if (i2 == 0) {
            this.f7087OooO0oo = decoderInputBuffer.f7087OooO0oo;
            if (decoderInputBuffer.OooO0o(1)) {
                this.f33931OooO0Oo = 1;
            }
        }
        if (decoderInputBuffer.OooO0oO()) {
            this.f33931OooO0Oo = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.f7084OooO0o;
        if (byteBuffer3 != null) {
            OooOO0(byteBuffer3.remaining());
            this.f7084OooO0o.put(byteBuffer3);
        }
        this.f34208OooOO0o = decoderInputBuffer.f7087OooO0oo;
        return true;
    }
}
