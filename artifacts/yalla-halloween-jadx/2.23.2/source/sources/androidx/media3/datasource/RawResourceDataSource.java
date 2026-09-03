package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o0000O0O;
import androidx.camera.core.impl.OooOOOO;
import androidx.media3.common.util.UnstableApi;
import com.facebook.internal.security.CertificateUtil;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p028Oooo0oO.o0oOO;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class RawResourceDataSource extends o000O0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public FileInputStream f7022OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f7023OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Resources f7024OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Uri f7025OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f7026OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f7027OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f7028OooOO0O;

    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(@Nullable Exception exc, int i, @Nullable String str) {
            super(exc, i, str);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f7024OooO0o0 = context.getResources();
        this.f7023OooO0o = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws RawResourceDataSourceException {
        int identifier;
        Uri uriNormalizeScheme = dataSpec.f6970OooO00o.normalizeScheme();
        this.f7025OooO0oO = uriNormalizeScheme;
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Resources resources = this.f7024OooO0o0;
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
            identifier = resources.getIdentifier(o0oOO.OooO0O0(new StringBuilder(), TextUtils.isEmpty(host) ? "" : OooOOOO.OooO00o(host, CertificateUtil.DELIMITER), path), "raw", this.f7023OooO0o);
            if (identifier == 0) {
                throw new RawResourceDataSourceException(null, 2005, "Resource not found.");
            }
        }
        OooOOO(dataSpec);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.f7026OooO0oo = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException(null, 2000, o0000O0O.OooO00o("Resource is compressed: ", uriNormalizeScheme));
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f7022OooO = fileInputStream;
            long j = dataSpec.f6974OooO0o;
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
                        this.f7027OooOO0 = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f7027OooOO0 = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(null, 2008, null);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f7027OooOO0 = j2;
                    if (j2 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j3 = dataSpec.f6976OooO0oO;
                if (j3 != -1) {
                    long j4 = this.f7027OooOO0;
                    this.f7027OooOO0 = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.f7028OooOO0O = true;
                OooOOOO(dataSpec);
                return j3 != -1 ? j3 : this.f7027OooOO0;
            } catch (RawResourceDataSourceException e) {
                throw e;
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(e2, 2000, null);
            }
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(e3, 2005, null);
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f7025OooO0oO;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003d */
    /* JADX WARN: Bottom block not found for handler: all -> 0x005a */
    @Override // androidx.media3.datasource.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws RawResourceDataSourceException {
        this.f7025OooO0oO = null;
        try {
            FileInputStream fileInputStream = this.f7022OooO;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f7022OooO = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f7026OooO0oo;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f7026OooO0oo = null;
                    if (this.f7028OooOO0O) {
                        this.f7028OooOO0O = false;
                        OooOOO0();
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(e, 2000, null);
                }
            } catch (Throwable th) {
                this.f7026OooO0oo = null;
                if (this.f7028OooOO0O) {
                    this.f7028OooOO0O = false;
                    OooOOO0();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(e2, 2000, null);
        }
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f7027OooOO0;
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
        FileInputStream fileInputStream = this.f7022OooO;
        int i3 = o00.f34910OooO00o;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f7027OooOO0 == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException(), 2000, "End of stream reached having not read sufficient data.");
        }
        long j2 = this.f7027OooOO0;
        if (j2 != -1) {
            this.f7027OooOO0 = j2 - ((long) i4);
        }
        OooOO0o(i4);
        return i4;
    }
}
