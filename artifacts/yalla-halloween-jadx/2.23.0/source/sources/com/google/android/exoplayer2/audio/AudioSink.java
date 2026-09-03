package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.o00Ooo;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import p028Oooo0oO.o00O0000;
import p041Ooooo0o.o00000;
import p200o00o0o.o0O0OOO0;
import p205o00o0oO0.o000O000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface AudioSink {

    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f11449OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f11450OooO0o0;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i, int i2, int i3, int i4, com.google.android.exoplayer2.OooOo oooOo, boolean z, @Nullable RuntimeException runtimeException) {
            StringBuilder sbOooO00o = o00000.OooO00o("AudioTrack init failed ", i, " Config(", i2, ", ");
            p082o000OoOo.OooOOO0.OooO00o(sbOooO00o, i3, ", ", i4, ") ");
            sbOooO00o.append(oooOo);
            sbOooO00o.append(z ? " (recoverable)" : "");
            super(sbOooO00o.toString(), runtimeException);
            this.f11449OooO0Oo = i;
            this.f11450OooO0o0 = z;
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
        public final int f11451OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final com.google.android.exoplayer2.OooOo f11452OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f11453OooO0o0;

        public WriteException(int i, com.google.android.exoplayer2.OooOo oooOo, boolean z) {
            super(android.support.v4.media.OooO00o.OooO00o("AudioTrack write failed: ", i));
            this.f11453OooO0o0 = z;
            this.f11451OooO0Oo = i;
            this.f11452OooO0o = oooOo;
        }
    }

    void OooO(com.google.android.exoplayer2.OooOo oooOo, @Nullable int[] iArr) throws ConfigurationException;

    o00Ooo OooO00o();

    void OooO0O0();

    boolean OooO0OO(com.google.android.exoplayer2.OooOo oooOo);

    boolean OooO0Oo();

    @RequiresApi(23)
    void OooO0o(@Nullable AudioDeviceInfo audioDeviceInfo);

    void OooO0o0(o00Ooo o00ooo2);

    boolean OooO0oO();

    void OooO0oo(int i);

    void OooOO0();

    void OooOO0O(@Nullable o0O0OOO0 o0o0ooo0);

    void OooOO0o(com.google.android.exoplayer2.audio.OooO00o oooO00o);

    void OooOOO();

    boolean OooOOO0(ByteBuffer byteBuffer, long j, int i) throws WriteException, InitializationException;

    int OooOOOO(com.google.android.exoplayer2.OooOo oooOo);

    void OooOOOo(float f);

    long OooOOo(boolean z);

    void OooOOo0() throws WriteException;

    void OooOOoo();

    void OooOo0(o000O000 o000o001);

    void OooOo00();

    void OooOo0O(boolean z);

    void flush();

    void pause();

    void release();

    void reset();

    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final com.google.android.exoplayer2.OooOo f11448OooO0Oo;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, com.google.android.exoplayer2.OooOo oooOo) {
            super(unhandledAudioFormatException);
            this.f11448OooO0Oo = oooOo;
        }

        public ConfigurationException(String str, com.google.android.exoplayer2.OooOo oooOo) {
            super(str);
            this.f11448OooO0Oo = oooOo;
        }
    }
}
