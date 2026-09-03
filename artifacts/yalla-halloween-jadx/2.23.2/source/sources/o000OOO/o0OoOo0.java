package o000OOO;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.o00Ooo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface o0OoOo0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Handler f34593OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o0OoOo0 f34594OooO0O0;

        public OooO00o(@Nullable Handler handler, @Nullable androidx.media3.exoplayer.OooO.OooO0O0 oooO0O0) {
            this.f34593OooO00o = handler;
            this.f34594OooO0O0 = oooO0O0;
        }

        public final void OooO00o(o000O00O.OooOo oooOo) {
            synchronized (oooOo) {
            }
            Handler handler = this.f34593OooO00o;
            if (handler != null) {
                handler.post(new OooOO0O.OooO0OO(2, this, oooOo));
            }
        }

        public final void OooO0O0(o00Ooo o00ooo2) {
            Handler handler = this.f34593OooO00o;
            if (handler != null) {
                handler.post(new OooOOOO.OooO00o(4, this, o00ooo2));
            }
        }
    }

    void OooO(Exception exc);

    void OooO00o(o000O00O.OooOo oooOo);

    void OooO0O0(String str);

    void OooOO0(long j, Object obj);

    void OooOO0o(o000O00O.OooOo oooOo);

    void OooOOOO(int i, long j);

    void OooOOOo(int i, long j);

    void OooOOo0(androidx.media3.common.OooOO0 oooOO1, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    @Deprecated
    void OooOOoo();

    void OooOo00(long j, long j2, String str);

    void onVideoSizeChanged(o00Ooo o00ooo2);
}
