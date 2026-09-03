package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o000O0.o0oOO;
import o000O00O.o00O000;
import o000O00O.o00OO000;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface Renderer extends OooOOO.OooO0O0 {

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

    void OooO();

    boolean OooO0Oo();

    void OooO0o();

    boolean OooO0o0();

    void OooO0oO(int i, o0oOO o0ooo2);

    boolean OooO0oo();

    void OooOO0(androidx.media3.common.OooOO0[] oooOO0Arr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException;

    void OooOO0O(o00OO000 o00oo001, androidx.media3.common.OooOO0[] oooOO0Arr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    boolean OooOOO();

    void OooOOO0() throws IOException;

    int OooOOOO();

    OooO0O0 OooOOOo();

    void OooOOo(float f, float f2) throws ExoPlaybackException;

    @Nullable
    o00O000 OooOo();

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
