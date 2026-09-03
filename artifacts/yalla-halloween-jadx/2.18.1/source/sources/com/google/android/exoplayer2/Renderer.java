package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.SampleStream;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p318o0O0oOo.o0000O0O;
import p466o0OooO0.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public interface Renderer extends OooOo.OooO0O0 {

    public interface OooO00o {
        void OooO00o();

        void OooO0O0(long j);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VideoScalingMode {
    }

    void OooO(o000O0Oo o000o0oo2, Format[] formatArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    void OooO00o();

    boolean OooO0O0();

    boolean OooO0Oo();

    void OooO0o();

    boolean OooO0oo();

    void OooOO0(Format[] formatArr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException;

    void OooOO0O();

    RendererCapabilities OooOO0o();

    void OooOOOO(long j, long j2) throws ExoPlaybackException;

    void OooOOo(float f) throws ExoPlaybackException;

    @Nullable
    SampleStream OooOOo0();

    void OooOOoo() throws IOException;

    int OooOo();

    void OooOo0(long j) throws ExoPlaybackException;

    long OooOo00();

    boolean OooOo0O();

    @Nullable
    o0000O0O OooOo0o();

    String getName();

    int getState();

    void setIndex(int i);

    void start() throws ExoPlaybackException;

    void stop();
}
