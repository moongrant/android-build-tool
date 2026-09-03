package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class RawResourceDataSource extends p709oo0oOOo.OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public FileInputStream f14871OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f14872OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Resources f14873OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Uri f14874OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f14875OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f14876OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f14877OooOO0O;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f14873OooO0o0 = context.getResources();
        this.f14872OooO0o = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws RawResourceDataSourceException {
        int identifier;
        Uri uri = dataSpec.f14801OooO00o;
        this.f14874OooO0oO = uri;
        if (TextUtils.equals("rawresource", uri.getScheme())) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                Objects.requireNonNull(lastPathSegment);
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.");
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                Objects.requireNonNull(lastPathSegment2);
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    Objects.requireNonNull(lastPathSegment3);
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource");
            }
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            String strValueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(CertificateUtil.DELIMITER));
            String strValueOf2 = String.valueOf(path);
            identifier = this.f14873OooO0o0.getIdentifier(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), "raw", this.f14872OooO0o);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.");
            }
        }
        OooOOo0(dataSpec);
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f14873OooO0o0.openRawResourceFd(identifier);
        this.f14875OooO0oo = assetFileDescriptorOpenRawResourceFd;
        if (assetFileDescriptorOpenRawResourceFd == null) {
            String strValueOf3 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf3.length() + 24);
            sb.append("Resource is compressed: ");
            sb.append(strValueOf3);
            throw new RawResourceDataSourceException(sb.toString());
        }
        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
        this.f14871OooO = fileInputStream;
        try {
            fileInputStream.skip(assetFileDescriptorOpenRawResourceFd.getStartOffset());
            if (fileInputStream.skip(dataSpec.f14805OooO0o) < dataSpec.f14805OooO0o) {
                throw new EOFException();
            }
            long j = dataSpec.f14807OooO0oO;
            if (j != -1) {
                this.f14876OooOO0 = j;
            } else {
                long length = assetFileDescriptorOpenRawResourceFd.getLength();
                this.f14876OooOO0 = length != -1 ? length - dataSpec.f14805OooO0o : -1L;
            }
            this.f14877OooOO0O = true;
            OooOOo(dataSpec);
            return this.f14876OooOO0;
        } catch (IOException e) {
            throw new RawResourceDataSourceException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        return this.f14874OooO0oO;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0035 */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws RawResourceDataSourceException {
        this.f14874OooO0oO = null;
        try {
            FileInputStream fileInputStream = this.f14871OooO;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f14871OooO = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f14875OooO0oo;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f14875OooO0oo = null;
                    if (this.f14877OooOO0O) {
                        this.f14877OooOO0O = false;
                        OooOOOo();
                    }
                } catch (Throwable th) {
                    this.f14875OooO0oo = null;
                    if (this.f14877OooOO0O) {
                        this.f14877OooOO0O = false;
                        OooOOOo();
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RawResourceDataSourceException(e);
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(e2);
        }
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14876OooOO0;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(e);
            }
        }
        FileInputStream fileInputStream = this.f14871OooO;
        int i3 = o000OOo0.f36740OooO00o;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f14876OooOO0 == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j2 = this.f14876OooOO0;
        if (j2 != -1) {
            this.f14876OooOO0 = j2 - ((long) i4);
        }
        OooOOOO(i4);
        return i4;
    }
}
