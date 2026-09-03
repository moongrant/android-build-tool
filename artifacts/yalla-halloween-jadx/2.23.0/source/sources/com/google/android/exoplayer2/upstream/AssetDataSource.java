package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p244o00oo0Oo.o000OO00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AssetDataSource extends o000OO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14146OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Uri f14147OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AssetManager f14148OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public InputStream f14149OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f14150OooO0oo;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(int i, @Nullable IOException iOException) {
            super(i, iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f14148OooO0o0 = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws AssetDataSourceException {
        try {
            Uri uri = dataSpec.f14161OooO00o;
            long j = dataSpec.f14165OooO0o;
            this.f14147OooO0o = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            OooOOO(dataSpec);
            InputStream inputStreamOpen = this.f14148OooO0o0.open(path, 1);
            this.f14149OooO0oO = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSourceException(2008, null);
            }
            long j2 = dataSpec.f14167OooO0oO;
            if (j2 != -1) {
                this.f14150OooO0oo = j2;
            } else {
                long jAvailable = this.f14149OooO0oO.available();
                this.f14150OooO0oo = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f14150OooO0oo = -1L;
                }
            }
            this.f14146OooO = true;
            OooOOOO(dataSpec);
            return this.f14150OooO0oo;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f14147OooO0o;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws AssetDataSourceException {
        this.f14147OooO0o = null;
        try {
            try {
                InputStream inputStream = this.f14149OooO0oO;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f14149OooO0oO = null;
                if (this.f14146OooO) {
                    this.f14146OooO = false;
                    OooOOO0();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(2000, e);
            }
        } catch (Throwable th) {
            this.f14149OooO0oO = null;
            if (this.f14146OooO) {
                this.f14146OooO = false;
                OooOOO0();
            }
            throw th;
        }
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14150OooO0oo;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(2000, e);
            }
        }
        InputStream inputStream = this.f14149OooO0oO;
        int i3 = o0O00.f40595OooO00o;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f14150OooO0oo;
        if (j2 != -1) {
            this.f14150OooO0oo = j2 - ((long) i4);
        }
        OooOO0o(i4);
        return i4;
    }
}
