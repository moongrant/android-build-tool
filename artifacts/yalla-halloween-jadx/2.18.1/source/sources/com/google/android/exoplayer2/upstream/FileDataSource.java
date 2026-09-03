package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class FileDataSource extends p709oo0oOOo.OooOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Uri f14810OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f14811OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f14812OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f14813OooO0oo;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    public static RandomAccessFile OooOOoo(Uri uri) throws FileDataSourceException {
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws FileDataSourceException {
        try {
            Uri uri = dataSpec.f14801OooO00o;
            this.f14810OooO0o = uri;
            OooOOo0(dataSpec);
            RandomAccessFile randomAccessFileOooOOoo = OooOOoo(uri);
            this.f14811OooO0o0 = randomAccessFileOooOOoo;
            randomAccessFileOooOOoo.seek(dataSpec.f14805OooO0o);
            long length = dataSpec.f14807OooO0oO;
            if (length == -1) {
                length = this.f14811OooO0o0.length() - dataSpec.f14805OooO0o;
            }
            this.f14812OooO0oO = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f14813OooO0oo = true;
            OooOOo(dataSpec);
            return this.f14812OooO0oO;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        return this.f14810OooO0o;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws FileDataSourceException {
        this.f14810OooO0o = null;
        try {
            RandomAccessFile randomAccessFile = this.f14811OooO0o0;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f14811OooO0o0 = null;
            if (this.f14813OooO0oo) {
                this.f14813OooO0oo = false;
                OooOOOo();
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14812OooO0oO;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14811OooO0o0;
            int i3 = o000OOo0.f36740OooO00o;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f14812OooO0oO -= (long) i4;
                OooOOOO(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }
}
