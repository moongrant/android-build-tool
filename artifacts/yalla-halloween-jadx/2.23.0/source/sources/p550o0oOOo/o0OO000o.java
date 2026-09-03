package p550o0oOOo;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import net.sqlcipher.database.SQLiteDatabase;
import org.jctools.util.Pow2;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OO000o extends DecoderInputBuffer {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f55935OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f55936OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f55937OooOOO0;

    public o0OO000o() {
        super(2);
        this.f55936OooOOO = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    public final void OooO0oo() {
        super.OooO0oo();
        this.f55937OooOOO0 = 0;
    }

    public final boolean OooOO0o(DecoderInputBuffer decoderInputBuffer) {
        boolean z;
        ByteBuffer byteBuffer;
        o00O000o.OooO00o(!decoderInputBuffer.OooO0o(Pow2.MAX_POW2));
        o00O000o.OooO00o(!decoderInputBuffer.OooO0o(SQLiteDatabase.CREATE_IF_NECESSARY));
        o00O000o.OooO00o(!decoderInputBuffer.OooO0o(4));
        int i = this.f55937OooOOO0;
        if (i > 0) {
            if (i < this.f55936OooOOO && decoderInputBuffer.OooO0oO() == OooO0oO()) {
                ByteBuffer byteBuffer2 = decoderInputBuffer.f11674OooO0o;
                if (byteBuffer2 != null && (byteBuffer = this.f11674OooO0o) != null) {
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
        int i2 = this.f55937OooOOO0;
        this.f55937OooOOO0 = i2 + 1;
        if (i2 == 0) {
            this.f11677OooO0oo = decoderInputBuffer.f11677OooO0oo;
            if (decoderInputBuffer.OooO0o(1)) {
                this.f39410OooO0Oo = 1;
            }
        }
        if (decoderInputBuffer.OooO0oO()) {
            this.f39410OooO0Oo = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.f11674OooO0o;
        if (byteBuffer3 != null) {
            OooOO0(byteBuffer3.remaining());
            this.f11674OooO0o.put(byteBuffer3);
        }
        this.f55935OooOO0o = decoderInputBuffer.f11677OooO0oo;
        return true;
    }
}
