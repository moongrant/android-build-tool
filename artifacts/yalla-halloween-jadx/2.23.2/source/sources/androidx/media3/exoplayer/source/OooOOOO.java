package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import o000O0.o0oOO;
import p069o0000ooO.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOOOO {

    public interface OooO00o {
        @UnstableApi
        OooOOOO OooO00o(androidx.media3.common.OooOOO0 oooOOO0);

        @UnstableApi
        OooO00o OooO0O0(o000OO0O.OooOO0O oooOO0O);

        @UnstableApi
        OooO00o OooO0OO(p074o000OO0o.o00oO0o o00oo0o2);

        @UnstableApi
        OooO00o OooO0Oo(LoadErrorHandlingPolicy loadErrorHandlingPolicy);
    }

    @UnstableApi
    public static final class OooO0O0 extends o0000O00 {
        public OooO0O0(int i, long j, Object obj) {
            super(j, -1, -1, i, obj);
        }

        public final OooO0O0 OooO0O0(Object obj) {
            o0000O00 o0000o00;
            if (this.f33816OooO00o.equals(obj)) {
                o0000o00 = this;
            } else {
                o0000o00 = new o0000O00(this.f33819OooO0Oo, this.f33817OooO0O0, this.f33818OooO0OO, this.f33820OooO0o0, obj);
            }
            return new OooO0O0(o0000o00);
        }

        public OooO0O0(int i, int i2, long j, Object obj) {
            super(j, i, i2, -1, obj);
        }
    }

    @UnstableApi
    public interface OooO0OO {
        void OooO00o(OooOOOO oooOOOO, androidx.media3.common.Oooo0 oooo0);
    }

    @UnstableApi
    void OooO(OooO0OO oooO0OO);

    @UnstableApi
    void OooO00o(Handler handler, OooOo00 oooOo00);

    @UnstableApi
    void OooO0O0(OooOo00 oooOo00);

    @UnstableApi
    OooOOO OooO0OO(OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, long j);

    @UnstableApi
    androidx.media3.common.OooOOO0 OooO0Oo();

    @UnstableApi
    void OooO0o(androidx.media3.exoplayer.drm.OooO0O0 oooO0O0);

    @UnstableApi
    void OooO0o0(Handler handler, androidx.media3.exoplayer.drm.OooO0O0 oooO0O0);

    @UnstableApi
    void OooO0oO(OooOOO oooOOO);

    @UnstableApi
    void OooO0oo(OooO0OO oooO0OO, @Nullable o000O0O.OooOo oooOo, o0oOO o0ooo2);

    @UnstableApi
    void OooOO0(OooO0OO oooO0OO);

    @UnstableApi
    void OooOO0O(OooO0OO oooO0OO);

    @UnstableApi
    void OooOO0o() throws IOException;

    @Nullable
    @UnstableApi
    androidx.media3.common.Oooo0 OooOOO();

    @UnstableApi
    boolean OooOOO0();
}
