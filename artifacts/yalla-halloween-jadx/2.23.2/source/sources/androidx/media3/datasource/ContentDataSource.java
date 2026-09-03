package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ContentDataSource extends o000O0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f6960OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Uri f6961OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ContentResolver f6962OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f6963OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public FileInputStream f6964OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f6965OooOO0;

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(@Nullable IOException iOException, int i) {
            super(i, iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f6962OooO0o0 = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = dataSpec.f6970OooO00o.normalizeScheme();
            this.f6961OooO0o = uriNormalizeScheme;
            OooOOO(dataSpec);
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f6962OooO0o0;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, MediaUtils.UNKNOWN, bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f6963OooO0oO = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f6964OooO0oo = fileInputStream;
            long j = dataSpec.f6974OooO0o;
            if (length != -1 && j > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f6960OooO = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f6960OooO = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.f6960OooO = j2;
                if (j2 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long j3 = dataSpec.f6976OooO0oO;
            if (j3 != -1) {
                long j4 = this.f6960OooO;
                this.f6960OooO = j4 == -1 ? j3 : Math.min(j4, j3);
            }
            this.f6965OooOO0 = true;
            OooOOOO(dataSpec);
            return j3 != -1 ? j3 : this.f6960OooO;
        } catch (ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f6961OooO0o;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // androidx.media3.datasource.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws ContentDataSourceException {
        this.f6961OooO0o = null;
        try {
            FileInputStream fileInputStream = this.f6964OooO0oo;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f6964OooO0oo = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f6963OooO0oO;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f6963OooO0oO = null;
                    if (this.f6965OooOO0) {
                        this.f6965OooOO0 = false;
                        OooOOO0();
                    }
                } catch (IOException e) {
                    throw new ContentDataSourceException(e, 2000);
                }
            } catch (Throwable th) {
                this.f6963OooO0oO = null;
                if (this.f6965OooOO0) {
                    this.f6965OooOO0 = false;
                    OooOOO0();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2, 2000);
        }
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6960OooO;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f6964OooO0oo;
        int i3 = o00.f34910OooO00o;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f6960OooO;
        if (j2 != -1) {
            this.f6960OooO = j2 - ((long) i4);
        }
        OooOO0o(i4);
        return i4;
    }
}
