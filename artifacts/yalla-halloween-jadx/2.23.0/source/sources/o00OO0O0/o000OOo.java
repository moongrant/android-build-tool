package o00OO0O0;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000000O;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo<T> implements o00000O0<T, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO<T> f37218OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000oo f37219OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0 f37220OooO0OO = f37215OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000000O<Long> f37214OooO0Oo = new o000000O<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new OooO00o());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o000000O<Integer> f37216OooO0o0 = new o000000O<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new OooO0O0());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOO0 f37215OooO0o = new OooOO0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final List<String> f37217OooO0oO = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    @VisibleForTesting
    public interface OooO<T> {
        void OooO00o(MediaExtractor mediaExtractor, T t) throws IOException;

        void OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public class OooO00o implements o000000O.OooO0O0<Long> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f37221OooO00o = ByteBuffer.allocate(8);

        @Override // o00O0oOo.o000000O.OooO0O0
        public final void OooO00o(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.f37221OooO00o) {
                this.f37221OooO00o.position(0);
                messageDigest.update(this.f37221OooO00o.putLong(l2.longValue()).array());
            }
        }
    }

    public class OooO0O0 implements o000000O.OooO0O0<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f37222OooO00o = ByteBuffer.allocate(4);

        @Override // o00O0oOo.o000000O.OooO0O0
        public final void OooO00o(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f37222OooO00o) {
                this.f37222OooO00o.position(0);
                messageDigest.update(this.f37222OooO00o.putInt(num2.intValue()).array());
            }
        }
    }

    public static final class OooO0OO implements OooO<AssetFileDescriptor> {
        @Override // o00OO0O0.o000OOo.OooO
        public final void OooO00o(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // o00OO0O0.o000OOo.OooO
        public final void OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    @RequiresApi(23)
    public static final class OooO0o implements OooO<ByteBuffer> {
        @Override // o00OO0O0.o000OOo.OooO
        public final void OooO00o(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new o000000(byteBuffer));
        }

        @Override // o00OO0O0.o000OOo.OooO
        public final void OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new o000000(byteBuffer));
        }
    }

    @VisibleForTesting
    public static class OooOO0 {
    }

    public static final class OooOO0O implements OooO<ParcelFileDescriptor> {
        @Override // o00OO0O0.o000OOo.OooO
        public final void OooO00o(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // o00OO0O0.o000OOo.OooO
        public final void OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public static final class OooOOO0 extends RuntimeException {
        public OooOOO0() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public o000OOo(o0000oo o0000ooVar, OooO<T> oooO) {
        this.f37219OooO0O0 = o0000ooVar;
        this.f37218OooO00o = oooO;
    }

    @Override // p126o00O0oOo.o00000O0
    public final o0000<Bitmap> OooO00o(@NonNull T t, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        long jLongValue = ((Long) o00000Var.OooO0OO(f37214OooO0Oo)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) o00000Var.OooO0OO(f37216OooO0o0);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) o00000Var.OooO0OO(DownsampleStrategy.f9988OooO0o);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f9989OooO0o0;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.f37220OooO0OO.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f37218OooO00o.OooO0O0(mediaMetadataRetriever, t);
            return o00OO0O0.OooOOO0.OooO0OO(OooO0OO(t, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, downsampleStrategy2), this.f37219OooO0O0);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull T t, @NonNull o00000 o00000Var) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00db  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x015a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0160  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x019d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a3  */
    @Nullable
    public final Bitmap OooO0OO(@NonNull T t, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        boolean z4 = false;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f37218OooO00o.OooO00o(mediaExtractor, t);
                        int trackCount = mediaExtractor.getTrackCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= trackCount) {
                                mediaExtractor.release();
                                z = false;
                            } else if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i8).getString("mime"))) {
                                mediaExtractor.release();
                                z = true;
                            } else {
                                i8++;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            if (Log.isLoggable("VideoDecoder", 3)) {
                                Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                            }
                            if (mediaExtractor != null) {
                            }
                            z = false;
                            if (!z) {
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                            if (Build.VERSION.SDK_INT >= 27) {
                                try {
                                    i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                    i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                    i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                    if (i7 != 90) {
                                        i6 = i5;
                                        i5 = i6;
                                    } else {
                                        i6 = i5;
                                        i5 = i6;
                                    }
                                    float fOooO0O0 = downsampleStrategy.OooO0O0(i5, i6, i2, i3);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i5 * fOooO0O0), Math.round(fOooO0O0 * i6));
                                } catch (Throwable th2) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
                                    }
                                }
                            }
                            if (bitmapCreateBitmap == null) {
                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
                            }
                            if (Build.MODEL.startsWith("Pixel")) {
                                int i9 = Build.VERSION.SDK_INT;
                                if (i9 < 30) {
                                }
                            } else {
                                int i10 = Build.VERSION.SDK_INT;
                                if (i10 < 30) {
                                }
                            }
                            if (z2) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i4 = Integer.parseInt(strExtractMetadata);
                                    int i11 = Integer.parseInt(strExtractMetadata2);
                                    z3 = i4 == 7 ? true : true;
                                    if (z3) {
                                        z4 = true;
                                    }
                                } catch (NumberFormatException unused) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                                    }
                                }
                                if (z4) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                    }
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                return bitmapCreateBitmap;
                            }
                            throw new OooOOO0();
                        } catch (Throwable th3) {
                            if (mediaExtractor != null) {
                                mediaExtractor.release();
                            }
                            throw th3;
                        }
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th4) {
                th = th4;
                mediaExtractor = null;
            }
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.f9987OooO0Oo) {
            i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i7 != 90 || i7 == 270) {
                i6 = i5;
                i5 = i6;
            }
            float fOooO0O1 = downsampleStrategy.OooO0O0(i5, i6, i2, i3);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i5 * fOooO0O1), Math.round(fOooO0O1 * i6));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            int i12 = Build.VERSION.SDK_INT;
            z2 = i12 < 30 && i12 < 33;
        } else {
            Iterator<String> it = f37217OooO0oO.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.ID.startsWith(it.next())) {
                    }
                }
            }
        }
        if (z2) {
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
            i4 = Integer.parseInt(strExtractMetadata3);
            int i13 = Integer.parseInt(strExtractMetadata4);
            if ((i4 == 7 && i4 != 6) || i13 != 6) {
                z3 = false;
            }
            if (z3 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                z4 = true;
            }
            if (z4) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new OooOOO0();
    }
}
