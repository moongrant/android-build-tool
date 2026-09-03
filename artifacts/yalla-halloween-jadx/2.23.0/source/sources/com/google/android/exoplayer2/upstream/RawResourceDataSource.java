package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o0000O0O;
import androidx.camera.core.impl.OooOOOO;
import com.facebook.internal.security.CertificateUtil;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p028Oooo0oO.o0O00o0;
import p244o00oo0Oo.o000OO00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class RawResourceDataSource extends o000OO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public FileInputStream f14253OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f14254OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Resources f14255OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Uri f14256OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f14257OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f14258OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f14259OooOO0O;

    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(@Nullable Exception exc, int i, @Nullable String str) {
            super(exc, i, str);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f14255OooO0o0 = context.getResources();
        this.f14254OooO0o = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws RawResourceDataSourceException {
        int identifier;
        Uri uriNormalizeScheme = dataSpec.f14161OooO00o.normalizeScheme();
        this.f14256OooO0oO = uriNormalizeScheme;
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Resources resources = this.f14255OooO0o0;
        if (zEquals) {
            try {
                String lastPathSegment = uriNormalizeScheme.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException(null, 1004, "Resource identifier must be an integer.");
            }
        } else {
            if (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1) {
                String lastPathSegment2 = uriNormalizeScheme.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uriNormalizeScheme.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException(null, 1004, "Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.");
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            identifier = resources.getIdentifier(o0O00o0.OooO0O0(new StringBuilder(), TextUtils.isEmpty(host) ? "" : OooOOOO.OooO00o(host, CertificateUtil.DELIMITER), path), "raw", this.f14254OooO0o);
            if (identifier == 0) {
                throw new RawResourceDataSourceException(null, 2005, "Resource not found.");
            }
        }
        OooOOO(dataSpec);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.f14257OooO0oo = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException(null, 2000, o0000O0O.OooO00o("Resource is compressed: ", uriNormalizeScheme));
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f14253OooO = fileInputStream;
            long j = dataSpec.f14165OooO0o;
            try {
                if (length != -1 && j > length) {
                    throw new RawResourceDataSourceException(null, 2008, null);
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new RawResourceDataSourceException(null, 2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f14258OooOO0 = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f14258OooOO0 = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(null, 2008, null);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f14258OooOO0 = j2;
                    if (j2 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j3 = dataSpec.f14167OooO0oO;
                if (j3 != -1) {
                    long j4 = this.f14258OooOO0;
                    this.f14258OooOO0 = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.f14259OooOO0O = true;
                OooOOOO(dataSpec);
                return j3 != -1 ? j3 : this.f14258OooOO0;
            } catch (RawResourceDataSourceException e) {
                throw e;
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(e2, 2000, null);
            }
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(e3, 2005, null);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f14256OooO0oO;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003d */
    /* JADX WARN: Bottom block not found for handler: all -> 0x005a */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws RawResourceDataSourceException {
        this.f14256OooO0oO = null;
        try {
            FileInputStream fileInputStream = this.f14253OooO;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f14253OooO = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f14257OooO0oo;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f14257OooO0oo = null;
                    if (this.f14259OooOO0O) {
                        this.f14259OooOO0O = false;
                        OooOOO0();
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(e, 2000, null);
                }
            } catch (Throwable th) {
                this.f14257OooO0oo = null;
                if (this.f14259OooOO0O) {
                    this.f14259OooOO0O = false;
                    OooOOO0();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(e2, 2000, null);
        }
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14258OooOO0;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(e, 2000, null);
            }
        }
        FileInputStream fileInputStream = this.f14253OooO;
        int i3 = o0O00.f40595OooO00o;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f14258OooOO0 == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException(), 2000, "End of stream reached having not read sufficient data.");
        }
        long j2 = this.f14258OooOO0;
        if (j2 != -1) {
            this.f14258OooOO0 = j2 - ((long) i4);
        }
        OooOO0o(i4);
        return i4;
    }
}
