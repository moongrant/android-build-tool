package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.LongCompanionObject;
import o000O0O.OooO0OO;
import o000Oo0.o000oOoO;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CacheDataSink implements OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f7038OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Cache f7039OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f7040OooO0O0 = 5242880;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f7041OooO0OO = 20480;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public DataSpec f7042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public File f7043OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f7044OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OutputStream f7045OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f7046OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o000oOoO f7047OooOO0;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(Cache cache) {
        this.f7039OooO00o = cache;
    }

    @Override // o000O0O.OooO0OO
    public final void OooO00o(DataSpec dataSpec) throws CacheDataSinkException {
        dataSpec.f6977OooO0oo.getClass();
        long j = dataSpec.f6976OooO0oO;
        int i = dataSpec.f6969OooO;
        if (j == -1) {
            if ((i & 2) == 2) {
                this.f7042OooO0Oo = null;
                return;
            }
        }
        this.f7042OooO0Oo = dataSpec;
        this.f7044OooO0o0 = (i & 4) == 4 ? this.f7040OooO0O0 : LongCompanionObject.MAX_VALUE;
        this.f7038OooO = 0L;
        try {
            OooO0Oo(dataSpec);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // o000O0O.OooO0OO
    public final void OooO0O0(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        DataSpec dataSpec = this.f7042OooO0Oo;
        if (dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f7046OooO0oo == this.f7044OooO0o0) {
                    OooO0OO();
                    OooO0Oo(dataSpec);
                }
                int iMin = (int) Math.min(i2 - i3, this.f7044OooO0o0 - this.f7046OooO0oo);
                OutputStream outputStream = this.f7045OooO0oO;
                int i4 = o00.f34910OooO00o;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f7046OooO0oo += j;
                this.f7038OooO += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }

    public final void OooO0OO() throws IOException {
        OutputStream outputStream = this.f7045OooO0oO;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            o00.OooO0oO(this.f7045OooO0oO);
            this.f7045OooO0oO = null;
            File file = this.f7043OooO0o;
            this.f7043OooO0o = null;
            this.f7039OooO00o.OooOO0(file, this.f7046OooO0oo);
        } catch (Throwable th) {
            o00.OooO0oO(this.f7045OooO0oO);
            this.f7045OooO0oO = null;
            File file2 = this.f7043OooO0o;
            this.f7043OooO0o = null;
            file2.delete();
            throw th;
        }
    }

    public final void OooO0Oo(DataSpec dataSpec) throws IOException {
        long j = dataSpec.f6976OooO0oO;
        long jMin = j != -1 ? Math.min(j - this.f7038OooO, this.f7044OooO0o0) : -1L;
        Cache cache = this.f7039OooO00o;
        String str = dataSpec.f6977OooO0oo;
        int i = o00.f34910OooO00o;
        this.f7043OooO0o = cache.OooO0oO(dataSpec.f6974OooO0o + this.f7038OooO, jMin, str);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f7043OooO0o);
        int i2 = this.f7041OooO0OO;
        if (i2 > 0) {
            o000oOoO o000oooo2 = this.f7047OooOO0;
            if (o000oooo2 == null) {
                this.f7047OooOO0 = new o000oOoO(fileOutputStream, i2);
            } else {
                o000oooo2.OooO00o(fileOutputStream);
            }
            this.f7045OooO0oO = this.f7047OooOO0;
        } else {
            this.f7045OooO0oO = fileOutputStream;
        }
        this.f7046OooO0oo = 0L;
    }

    @Override // o000O0O.OooO0OO
    public final void close() throws CacheDataSinkException {
        if (this.f7042OooO0Oo == null) {
            return;
        }
        try {
            OooO0OO();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }
}
