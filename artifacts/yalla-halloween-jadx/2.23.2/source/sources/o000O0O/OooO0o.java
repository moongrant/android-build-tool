package o000O0O;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO0o extends InputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o f34172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final DataSpec f34174OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f34175OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f34176OooO0oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f34173OooO0o = new byte[1];

    public OooO0o(OooOOOO oooOOOO, DataSpec dataSpec) {
        this.f34172OooO0Oo = oooOOOO;
        this.f34174OooO0o0 = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f34176OooO0oo) {
            return;
        }
        this.f34172OooO0Oo.close();
        this.f34176OooO0oo = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f34173OooO0o;
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
        o00Oo0.OooO0Oo(!this.f34176OooO0oo);
        boolean z = this.f34175OooO0oO;
        androidx.media3.datasource.OooO00o oooO00o = this.f34172OooO0Oo;
        if (!z) {
            oooO00o.OooO00o(this.f34174OooO0o0);
            this.f34175OooO0oO = true;
        }
        int i3 = oooO00o.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
