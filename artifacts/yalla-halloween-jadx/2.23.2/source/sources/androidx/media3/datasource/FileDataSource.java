package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FileDataSource extends o000O0O.OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Uri f6979OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f6980OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f6981OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f6982OooO0oo;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(int i, Exception exc) {
            super(i, exc);
        }

        public FileDataSourceException(@Nullable FileNotFoundException fileNotFoundException, int i, @Nullable String str) {
            super(fileNotFoundException, i, str);
        }
    }

    @RequiresApi(21)
    public static final class OooO00o {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        public static boolean OooO0O0(@Nullable Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class OooO0O0 implements androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o {
        @Override // androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o
        public final androidx.media3.datasource.OooO00o OooO00o() {
            return new FileDataSource();
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.f6970OooO00o;
        long j = dataSpec.f6974OooO0o;
        this.f6979OooO0o = uri;
        OooOOO(dataSpec);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f6980OooO0o0 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = dataSpec.f6976OooO0oO;
                if (length == -1) {
                    length = this.f6980OooO0o0.length() - j;
                }
                this.f6981OooO0oO = length;
                if (length < 0) {
                    throw new FileDataSourceException(null, 2008, null);
                }
                this.f6982OooO0oo = true;
                OooOOOO(dataSpec);
                return this.f6981OooO0oO;
            } catch (IOException e) {
                throw new FileDataSourceException(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException((o00.f34910OooO00o < 21 || !OooO00o.OooO0O0(e2.getCause())) ? 2005 : 2006, e2);
            }
            throw new FileDataSourceException(e2, 1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()));
        } catch (SecurityException e3) {
            throw new FileDataSourceException(2006, e3);
        } catch (RuntimeException e4) {
            throw new FileDataSourceException(2000, e4);
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f6979OooO0o;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() throws FileDataSourceException {
        this.f6979OooO0o = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6980OooO0o0;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f6980OooO0o0 = null;
                if (this.f6982OooO0oo) {
                    this.f6982OooO0oo = false;
                    OooOOO0();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(2000, e);
            }
        } catch (Throwable th) {
            this.f6980OooO0o0 = null;
            if (this.f6982OooO0oo) {
                this.f6982OooO0oo = false;
                OooOOO0();
            }
            throw th;
        }
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6981OooO0oO;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6980OooO0o0;
            int i3 = o00.f34910OooO00o;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f6981OooO0oO -= (long) i4;
                OooOO0o(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new FileDataSourceException(2000, e);
        }
    }
}
