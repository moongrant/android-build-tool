package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AssetDataSource extends o000O0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f6955OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Uri f6956OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AssetManager f6957OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public InputStream f6958OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f6959OooO0oo;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(int i, @Nullable IOException iOException) {
            super(i, iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f6957OooO0o0 = context.getAssets();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws AssetDataSourceException {
        try {
            Uri uri = dataSpec.f6970OooO00o;
            long j = dataSpec.f6974OooO0o;
            this.f6956OooO0o = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            OooOOO(dataSpec);
            InputStream inputStreamOpen = this.f6957OooO0o0.open(path, 1);
            this.f6958OooO0oO = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSourceException(2008, null);
            }
            long j2 = dataSpec.f6976OooO0oO;
            if (j2 != -1) {
                this.f6959OooO0oo = j2;
            } else {
                long jAvailable = this.f6958OooO0oO.available();
                this.f6959OooO0oo = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f6959OooO0oo = -1L;
                }
            }
            this.f6955OooO = true;
            OooOOOO(dataSpec);
            return this.f6959OooO0oo;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f6956OooO0o;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() throws AssetDataSourceException {
        this.f6956OooO0o = null;
        try {
            try {
                InputStream inputStream = this.f6958OooO0oO;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f6958OooO0oO = null;
                if (this.f6955OooO) {
                    this.f6955OooO = false;
                    OooOOO0();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(2000, e);
            }
        } catch (Throwable th) {
            this.f6958OooO0oO = null;
            if (this.f6955OooO) {
                this.f6955OooO = false;
                OooOOO0();
            }
            throw th;
        }
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6959OooO0oo;
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
        InputStream inputStream = this.f6958OooO0oO;
        int i3 = o00.f34910OooO00o;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f6959OooO0oo;
        if (j2 != -1) {
            this.f6959OooO0oo = j2 - ((long) i4);
        }
        OooOO0o(i4);
        return i4;
    }
}
