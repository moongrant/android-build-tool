package p224o00oOOOo;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O0 extends MediaDataSource {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f33847Oooo0o;

    public oOO00O0(ByteBuffer byteBuffer) {
        this.f33847Oooo0o = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f33847Oooo0o.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.f33847Oooo0o.limit()) {
            return -1;
        }
        this.f33847Oooo0o.position((int) j);
        int iMin = Math.min(i2, this.f33847Oooo0o.remaining());
        this.f33847Oooo0o.get(bArr, i, iMin);
        return iMin;
    }
}
