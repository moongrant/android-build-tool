package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.SampleStream;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o0O00O0o;
import p245o00oo0o.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface Renderer extends oo000o.OooO0O0 {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessageType {
    }

    public interface OooO00o {
        void OooO00o();

        void OooO0O0();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    void OooO(o0O00O0o o0o00o0o, OooOo[] oooOoArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    boolean OooO0O0();

    boolean OooO0Oo();

    void OooO0o();

    boolean OooO0oO();

    void OooO0oo();

    void OooOO0(int i, o0O0OOO0 o0o0ooo0);

    void OooOO0o() throws IOException;

    int OooOOO();

    boolean OooOOO0();

    void OooOOOO(OooOo[] oooOoArr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException;

    OooO0o OooOOOo();

    void OooOOo(float f, float f2) throws ExoPlaybackException;

    @Nullable
    o00OO00O OooOo();

    @Nullable
    SampleStream OooOo0();

    void OooOo00(long j, long j2) throws ExoPlaybackException;

    long OooOo0O();

    void OooOo0o(long j) throws ExoPlaybackException;

    String getName();

    int getState();

    void release();

    void reset();

    void start() throws ExoPlaybackException;

    void stop();
}
