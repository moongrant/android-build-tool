package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import p265o00ooo00.Oooo0;
import p293o0O0Oo0O.o00Ooo;
import p466o0OooO0.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioSink {

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th) {
            super(th);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    public static final class InitializationException extends Exception {
        public InitializationException(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder(82);
            sb.append("AudioTrack init failed: ");
            sb.append(i);
            sb.append(", Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            super(sb.toString());
        }
    }

    public interface OooO00o {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class WriteException extends Exception {
        public WriteException(int i) {
            super(Oooo0.OooO00o(36, "AudioTrack write failed: ", i));
        }
    }

    boolean OooO();

    void OooO00o();

    void OooO0O0();

    boolean OooO0OO(Format format);

    boolean OooO0Oo();

    void OooO0o0(o000O00 o000o01);

    o000O00 OooO0oO();

    void OooO0oo() throws WriteException;

    void OooOO0(p293o0O0Oo0O.OooOOO0 oooOOO0);

    void OooOO0O(int i);

    void OooOO0o(Format format, @Nullable int[] iArr) throws ConfigurationException;

    void OooOOO();

    long OooOOO0(boolean z);

    void OooOOOO();

    void OooOOOo(float f);

    void OooOOo(o00Ooo o00ooo2);

    void OooOOo0(int i);

    boolean OooOOoo(ByteBuffer byteBuffer, long j, int i) throws WriteException, InitializationException;

    void OooOo0(boolean z);

    int OooOo00(Format format);

    void flush();

    void pause();
}
