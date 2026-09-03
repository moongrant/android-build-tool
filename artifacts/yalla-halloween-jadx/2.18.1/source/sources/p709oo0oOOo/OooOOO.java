package p709oo0oOOo;

import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends InputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f53378Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final DataSpec f53379Oooo0oO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f53377Oooo = false;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f53381OoooO00 = false;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final byte[] f53380Oooo0oo = new byte[1];

    public OooOOO(OooO00o oooO00o, DataSpec dataSpec) {
        this.f53378Oooo0o = oooO00o;
        this.f53379Oooo0oO = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f53381OoooO00) {
            return;
        }
        this.f53378Oooo0o.close();
        this.f53381OoooO00 = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.f53380Oooo0oo) == -1) {
            return -1;
        }
        return this.f53380Oooo0oo[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        o00000O0.OooO0Oo(!this.f53381OoooO00);
        if (!this.f53377Oooo) {
            this.f53378Oooo0o.OooO0o(this.f53379Oooo0oO);
            this.f53377Oooo = true;
        }
        int i3 = this.f53378Oooo0o.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
