package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import o000O00O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OooO0O0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Handler f7529OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooO0O0 f7530OooO0O0;

        public OooO00o(@Nullable Handler handler, @Nullable androidx.media3.exoplayer.OooO.OooO0O0 oooO0O0) {
            this.f7529OooO00o = handler;
            this.f7530OooO0O0 = oooO0O0;
        }

        public final void OooO00o(OooOo oooOo) {
            synchronized (oooOo) {
            }
            Handler handler = this.f7529OooO00o;
            if (handler != null) {
                handler.post(new OooOOOO.OooO00o(3, this, oooOo));
            }
        }
    }

    void OooO0OO(String str);

    void OooO0Oo(OooOo oooOo);

    void OooO0o(long j);

    void OooO0o0(Exception exc);

    void OooO0oO(OooOO0 oooOO1, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void OooO0oo(OooOo oooOo);

    @Deprecated
    void OooOO0O();

    void OooOOO(long j, long j2, String str);

    void OooOOo(Exception exc);

    void OooOo0(int i, long j, long j2);

    void onSkipSilenceEnabledChanged(boolean z);
}
