package p244o00oo0Oo;

import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00oOoo extends InputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f40535OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final DataSpec f40537OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f40538OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f40539OooO0oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f40536OooO0o = new byte[1];

    public o00oOoo(o00O0O0 o00o0o0, DataSpec dataSpec) {
        this.f40535OooO0Oo = o00o0o0;
        this.f40537OooO0o0 = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f40539OooO0oo) {
            return;
        }
        this.f40535OooO0Oo.close();
        this.f40539OooO0oo = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f40536OooO0o;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        o00O000o.OooO0Oo(!this.f40539OooO0oo);
        boolean z = this.f40538OooO0oO;
        OooO00o oooO00o = this.f40535OooO0Oo;
        if (!z) {
            oooO00o.OooO00o(this.f40537OooO0o0);
            this.f40538OooO0oO = true;
        }
        int i3 = oooO00o.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
