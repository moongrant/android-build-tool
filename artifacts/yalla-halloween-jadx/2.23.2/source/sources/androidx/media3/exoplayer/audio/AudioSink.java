package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.OooOO0;
import androidx.media3.common.OooOOOO;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import o000O0.o0oOO;
import o000O0Oo.OooOOO0;
import p028Oooo0oO.o00O0000;
import p041Ooooo0o.o00000;
import p069o0000ooO.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface AudioSink {

    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f7405OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f7406OooO0o0;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i, int i2, int i3, int i4, OooOO0 oooOO1, boolean z, @Nullable RuntimeException runtimeException) {
            StringBuilder sbOooO00o = o00000.OooO00o("AudioTrack init failed ", i, " Config(", i2, ", ");
            OooOOO0.OooO00o(sbOooO00o, i3, ", ", i4, ") ");
            sbOooO00o.append(oooOO1);
            sbOooO00o.append(z ? " (recoverable)" : "");
            super(sbOooO00o.toString(), runtimeException);
            this.f7405OooO0Oo = i;
            this.f7406OooO0o0 = z;
        }
    }

    public interface OooO00o {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public UnexpectedDiscontinuityException(long j, long j2) {
            StringBuilder sbOooO00o = o00O0000.OooO00o("Unexpected audio track timestamp discontinuity: expected ", j2, ", got ");
            sbOooO00o.append(j);
            super(sbOooO00o.toString());
        }
    }

    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f7407OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooOO0 f7408OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f7409OooO0o0;

        public WriteException(int i, OooOO0 oooOO1, boolean z) {
            super(android.support.v4.media.OooO00o.OooO00o("AudioTrack write failed: ", i));
            this.f7409OooO0o0 = z;
            this.f7407OooO0Oo = i;
            this.f7408OooO0o = oooOO1;
        }
    }

    void OooO(int i);

    void OooO00o(OooOOOO oooOOOO);

    OooOOOO OooO0O0();

    boolean OooO0OO(OooOO0 oooOO1);

    void OooO0Oo();

    void OooO0o(androidx.media3.common.OooO00o oooO00o);

    boolean OooO0o0();

    @RequiresApi(23)
    void OooO0oO(@Nullable AudioDeviceInfo audioDeviceInfo);

    boolean OooO0oo();

    void OooOO0();

    void OooOO0O(@Nullable o0oOO o0ooo2);

    boolean OooOO0o(ByteBuffer byteBuffer, long j, int i) throws WriteException, InitializationException;

    void OooOOO() throws WriteException;

    void OooOOO0();

    long OooOOOO(boolean z);

    void OooOOOo(OooOO0 oooOO1, @Nullable int[] iArr) throws ConfigurationException;

    void OooOOo(float f);

    void OooOOo0();

    void OooOOoo();

    void OooOo0(o000OOo o000ooo2);

    int OooOo00(OooOO0 oooOO1);

    void OooOo0O(boolean z);

    void flush();

    void pause();

    void release();

    void reset();

    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOO0 f7404OooO0Oo;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, OooOO0 oooOO1) {
            super(unhandledAudioFormatException);
            this.f7404OooO0Oo = oooOO1;
        }

        public ConfigurationException(String str, OooOO0 oooOO1) {
            super(str);
            this.f7404OooO0Oo = oooOO1;
        }
    }
}
