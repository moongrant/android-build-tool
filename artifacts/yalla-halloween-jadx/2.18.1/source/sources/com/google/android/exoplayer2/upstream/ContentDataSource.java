package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentDataSource extends p709oo0oOOo.OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f14794OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Uri f14795OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ContentResolver f14796OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f14797OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public FileInputStream f14798OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f14799OooOO0;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f14796OooO0o0 = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws ContentDataSourceException {
        try {
            Uri uri = dataSpec.f14801OooO00o;
            this.f14795OooO0o = uri;
            OooOOo0(dataSpec);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f14796OooO0o0.openAssetFileDescriptor(uri, "r");
            this.f14797OooO0oO = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(strValueOf);
                throw new FileNotFoundException(sb.toString());
            }
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f14798OooO0oo = fileInputStream;
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(dataSpec.f14805OooO0o + startOffset) - startOffset;
            if (jSkip != dataSpec.f14805OooO0o) {
                throw new EOFException();
            }
            long j = dataSpec.f14807OooO0oO;
            if (j != -1) {
                this.f14794OooO = j;
            } else {
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f14794OooO = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f14794OooO = jPosition;
                        if (jPosition < 0) {
                            throw new EOFException();
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f14794OooO = j2;
                    if (j2 < 0) {
                        throw new EOFException();
                    }
                }
            }
            this.f14799OooOO0 = true;
            OooOOo(dataSpec);
            return this.f14794OooO;
        } catch (IOException e) {
            throw new ContentDataSourceException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        return this.f14795OooO0o;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0035 */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws ContentDataSourceException {
        this.f14795OooO0o = null;
        try {
            FileInputStream fileInputStream = this.f14798OooO0oo;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f14798OooO0oo = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f14797OooO0oO;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f14797OooO0oO = null;
                    if (this.f14799OooOO0) {
                        this.f14799OooOO0 = false;
                        OooOOOo();
                    }
                } catch (Throwable th) {
                    this.f14797OooO0oO = null;
                    if (this.f14799OooOO0) {
                        this.f14799OooOO0 = false;
                        OooOOOo();
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        }
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14794OooO;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            }
        }
        FileInputStream fileInputStream = this.f14798OooO0oo;
        int i3 = o000OOo0.f36740OooO00o;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f14794OooO == -1) {
                return -1;
            }
            throw new ContentDataSourceException(new EOFException());
        }
        long j2 = this.f14794OooO;
        if (j2 != -1) {
            this.f14794OooO = j2 - ((long) i4);
        }
        OooOOOO(i4);
        return i4;
    }
}
