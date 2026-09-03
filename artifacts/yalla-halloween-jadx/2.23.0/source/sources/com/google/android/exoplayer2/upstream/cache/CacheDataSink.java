package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.LongCompanionObject;
import p244o00oo0Oo.o0O0ooO;
import p245o00oo0o.o0O00;
import p246o00oo0o0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CacheDataSink implements o0O0ooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f14269OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Cache f14270OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f14271OooO0O0 = 5242880;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f14272OooO0OO = 20480;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public DataSpec f14273OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public File f14274OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f14275OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OutputStream f14276OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f14277OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o00O000 f14278OooOO0;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(Cache cache) {
        this.f14270OooO00o = cache;
    }

    @Override // p244o00oo0Oo.o0O0ooO
    public final void OooO00o(DataSpec dataSpec) throws CacheDataSinkException {
        dataSpec.f14168OooO0oo.getClass();
        long j = dataSpec.f14167OooO0oO;
        int i = dataSpec.f14160OooO;
        if (j == -1) {
            if ((i & 2) == 2) {
                this.f14273OooO0Oo = null;
                return;
            }
        }
        this.f14273OooO0Oo = dataSpec;
        this.f14275OooO0o0 = (i & 4) == 4 ? this.f14271OooO0O0 : LongCompanionObject.MAX_VALUE;
        this.f14269OooO = 0L;
        try {
            OooO0Oo(dataSpec);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // p244o00oo0Oo.o0O0ooO
    public final void OooO0O0(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        DataSpec dataSpec = this.f14273OooO0Oo;
        if (dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f14277OooO0oo == this.f14275OooO0o0) {
                    OooO0OO();
                    OooO0Oo(dataSpec);
                }
                int iMin = (int) Math.min(i2 - i3, this.f14275OooO0o0 - this.f14277OooO0oo);
                OutputStream outputStream = this.f14276OooO0oO;
                int i4 = o0O00.f40595OooO00o;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f14277OooO0oo += j;
                this.f14269OooO += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }

    public final void OooO0OO() throws IOException {
        OutputStream outputStream = this.f14276OooO0oO;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            o0O00.OooO0oO(this.f14276OooO0oO);
            this.f14276OooO0oO = null;
            File file = this.f14274OooO0o;
            this.f14274OooO0o = null;
            this.f14270OooO00o.OooO(file, this.f14277OooO0oo);
        } catch (Throwable th) {
            o0O00.OooO0oO(this.f14276OooO0oO);
            this.f14276OooO0oO = null;
            File file2 = this.f14274OooO0o;
            this.f14274OooO0o = null;
            file2.delete();
            throw th;
        }
    }

    public final void OooO0Oo(DataSpec dataSpec) throws IOException {
        long j = dataSpec.f14167OooO0oO;
        long jMin = j != -1 ? Math.min(j - this.f14269OooO, this.f14275OooO0o0) : -1L;
        Cache cache = this.f14270OooO00o;
        String str = dataSpec.f14168OooO0oo;
        int i = o0O00.f40595OooO00o;
        this.f14274OooO0o = cache.OooO0oo(dataSpec.f14165OooO0o + this.f14269OooO, jMin, str);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f14274OooO0o);
        int i2 = this.f14272OooO0OO;
        if (i2 > 0) {
            o00O000 o00o001 = this.f14278OooOO0;
            if (o00o001 == null) {
                this.f14278OooOO0 = new o00O000(fileOutputStream, i2);
            } else {
                o00o001.OooO00o(fileOutputStream);
            }
            this.f14276OooO0oO = this.f14278OooOO0;
        } else {
            this.f14276OooO0oO = fileOutputStream;
        }
        this.f14277OooO0oo = 0L;
    }

    @Override // p244o00oo0Oo.o0O0ooO
    public final void close() throws CacheDataSinkException {
        if (this.f14273OooO0Oo == null) {
            return;
        }
        try {
            OooO0OO();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }
}
