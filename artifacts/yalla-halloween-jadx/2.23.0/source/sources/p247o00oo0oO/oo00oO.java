package p247o00oo0oO;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import p026Oooo0o.OooOO0;
import p042OooooO0.oo00o;
import p206o00o0oOO.o0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface oo00oO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Handler f40868OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final oo00oO f40869OooO0O0;

        public OooO00o(@Nullable Handler handler, @Nullable OooOOO.OooO0O0 oooO0O0) {
            this.f40868OooO00o = handler;
            this.f40869OooO0O0 = oooO0O0;
        }

        public final void OooO00o(o0 o0Var) {
            synchronized (o0Var) {
            }
            Handler handler = this.f40868OooO00o;
            if (handler != null) {
                handler.post(new OooOO0(2, this, o0Var));
            }
        }

        public final void OooO0O0(o0oOOo o0oooo) {
            Handler handler = this.f40868OooO00o;
            if (handler != null) {
                handler.post(new oo00o(1, this, o0oooo));
            }
        }
    }

    void OooO(long j, Object obj);

    void OooO0O0(o0 o0Var);

    void OooO0OO(String str);

    void OooO0o(OooOo oooOo, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void OooO0oo(Exception exc);

    void OooOOO(int i, long j);

    void OooOOO0(int i, long j);

    void OooOOoo(o0 o0Var);

    void OooOo0(long j, long j2, String str);

    @Deprecated
    void OooOo00();

    void onVideoSizeChanged(o0oOOo o0oooo);
}
