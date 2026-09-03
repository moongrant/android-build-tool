package p224o00oOOOo;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
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
import java.util.Objects;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000O;
import p217o00oO00o.o00000O0;
import p219o00oO0O0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00<T> implements o00000O0<T, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0<T> f33830OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0oOOo f33831OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f33832OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000000O<Long> f33827OooO0Oo = new o000000O<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new OooO00o());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o000000O<Integer> f33829OooO0o0 = new o000000O<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new OooO0O0());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO f33828OooO0o = new OooO();

    @VisibleForTesting
    public static class OooO {
    }

    public class OooO00o implements o000000O.OooO0O0<Long> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f33833OooO00o = ByteBuffer.allocate(8);

        @Override // o00oO00o.o000000O.OooO0O0
        public final void OooO00o(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.f33833OooO00o) {
                this.f33833OooO00o.position(0);
                messageDigest.update(this.f33833OooO00o.putLong(l2.longValue()).array());
            }
        }
    }

    public class OooO0O0 implements o000000O.OooO0O0<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f33834OooO00o = ByteBuffer.allocate(4);

        @Override // o00oO00o.o000000O.OooO0O0
        public final void OooO00o(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f33834OooO00o) {
                this.f33834OooO00o.position(0);
                messageDigest.update(this.f33834OooO00o.putInt(num2.intValue()).array());
            }
        }
    }

    public static final class OooO0OO implements OooOO0<AssetFileDescriptor> {
        @Override // o00oOOOo.oOO00.OooOO0
        public final void OooO00o(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    @RequiresApi(23)
    public static final class OooO0o implements OooOO0<ByteBuffer> {
        @Override // o00oOOOo.oOO00.OooOO0
        public final void OooO00o(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new oOO00O0(byteBuffer));
        }
    }

    @VisibleForTesting
    public interface OooOO0<T> {
        void OooO00o(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public static final class OooOO0O implements OooOO0<ParcelFileDescriptor> {
        @Override // o00oOOOo.oOO00.OooOO0
        public final void OooO00o(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public static final class OooOOO0 extends RuntimeException {
        public OooOOO0() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public oOO00(o0oOOo o0oooo2, OooOO0<T> oooOO1) {
        OooO oooO = f33828OooO0o;
        this.f33831OooO0O0 = o0oooo2;
        this.f33830OooO00o = oooOO1;
        this.f33832OooO0OO = oooO;
    }

    @Nullable
    public static Bitmap OooO0OO(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap frameAtTime;
        if (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f12508OooO0Oo) {
            frameAtTime = null;
        } else {
            try {
                int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i6 == 90 || i6 == 270) {
                    i5 = i4;
                    i4 = i5;
                }
                float fOooO0O0 = downsampleStrategy.OooO0O0(i4, i5, i2, i3);
                frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fOooO0O0), Math.round(fOooO0O0 * i5));
            } catch (Throwable th) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                }
                frameAtTime = null;
            }
        }
        if (frameAtTime == null) {
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new OooOOO0();
    }

    @Override // p217o00oO00o.o00000O0
    public final o00OOOO0<Bitmap> OooO00o(@NonNull T t, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        long jLongValue = ((Long) o00000Var.OooO0OO(f33827OooO0Oo)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) o00000Var.OooO0OO(f33829OooO0o0);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) o00000Var.OooO0OO(DownsampleStrategy.f12509OooO0o);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f12510OooO0o0;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        Objects.requireNonNull(this.f33832OooO0OO);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f33830OooO00o.OooO00o(mediaMetadataRetriever, t);
            return oO0O0O0o.OooO0O0(OooO0OO(mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, downsampleStrategy2), this.f33831OooO0O0);
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull T t, @NonNull o00000 o00000Var) {
        return true;
    }
}
