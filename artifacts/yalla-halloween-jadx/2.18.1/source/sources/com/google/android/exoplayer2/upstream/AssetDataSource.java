package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class AssetDataSource extends p709oo0oOOo.OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14789OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Uri f14790OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AssetManager f14791OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public InputStream f14792OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f14793OooO0oo;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f14791OooO0o0 = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws AssetDataSourceException {
        try {
            Uri uri = dataSpec.f14801OooO00o;
            this.f14790OooO0o = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            OooOOo0(dataSpec);
            InputStream inputStreamOpen = this.f14791OooO0o0.open(path, 1);
            this.f14792OooO0oO = inputStreamOpen;
            if (inputStreamOpen.skip(dataSpec.f14805OooO0o) < dataSpec.f14805OooO0o) {
                throw new EOFException();
            }
            long j = dataSpec.f14807OooO0oO;
            if (j != -1) {
                this.f14793OooO0oo = j;
            } else {
                long jAvailable = this.f14792OooO0oO.available();
                this.f14793OooO0oo = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f14793OooO0oo = -1L;
                }
            }
            this.f14789OooO = true;
            OooOOo(dataSpec);
            return this.f14793OooO0oo;
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        return this.f14790OooO0o;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws AssetDataSourceException {
        this.f14790OooO0o = null;
        try {
            InputStream inputStream = this.f14792OooO0oO;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f14792OooO0oO = null;
            if (this.f14789OooO) {
                this.f14789OooO = false;
                OooOOOo();
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        }
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14793OooO0oo;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e);
            }
        }
        InputStream inputStream = this.f14792OooO0oO;
        int i3 = o000OOo0.f36740OooO00o;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f14793OooO0oo == -1) {
                return -1;
            }
            throw new AssetDataSourceException(new EOFException());
        }
        long j2 = this.f14793OooO0oo;
        if (j2 != -1) {
            this.f14793OooO0oo = j2 - ((long) i4);
        }
        OooOOOO(i4);
        return i4;
    }
}
