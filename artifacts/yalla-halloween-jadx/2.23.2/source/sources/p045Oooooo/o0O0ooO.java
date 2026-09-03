package p045Oooooo;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;
import p048Ooooooo.o0OOooO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O0ooO extends o000O0Oo implements o00O0000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f1977OooO0O0;

    public o0O0ooO(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f1960OooO00o.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f1977OooO0O0 = videoCapabilities;
    }

    @NonNull
    public static o0O0ooO OooO(@NonNull o000OOo0 o000ooo1) throws Throwable {
        MediaCodec mediaCodecOooO00o = new o0OOooO0().OooO00o(o000ooo1.OooO00o());
        MediaCodecInfo codecInfo = mediaCodecOooO00o.getCodecInfo();
        mediaCodecOooO00o.release();
        return new o0O0ooO(codecInfo, ((OooOOOO) o000ooo1).f1825OooO00o);
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO00o(int i) {
        try {
            return this.f1977OooO0O0.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // p045Oooooo.o00O0000
    public final int OooO0O0() {
        return this.f1977OooO0O0.getHeightAlignment();
    }

    @Override // p045Oooooo.o00O0000
    public final boolean OooO0OO(int i, int i2) {
        return this.f1977OooO0O0.isSizeSupported(i, i2);
    }

    @Override // p045Oooooo.o00O0000
    public final int OooO0Oo() {
        return this.f1977OooO0O0.getWidthAlignment();
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO0o(int i) {
        try {
            return this.f1977OooO0O0.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO0o0() {
        return this.f1977OooO0O0.getBitrateRange();
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO0oO() {
        return this.f1977OooO0O0.getSupportedWidths();
    }

    @Override // p045Oooooo.o00O0000
    @NonNull
    public final Range<Integer> OooO0oo() {
        return this.f1977OooO0O0.getSupportedHeights();
    }
}
