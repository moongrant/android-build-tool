package p069o0000ooO;

import android.os.Bundle;
import androidx.media3.common.OooO0OO;
import androidx.media3.common.OooO0o;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.regex.Pattern;
import p593o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000 implements OooO0OO.OooO00o, MediaCodecUtil.OooO, OooOOOO.OooO00o {
    @Override // androidx.media3.common.OooO0OO.OooO00o
    public final OooO0OO OooO0OO(Bundle bundle) {
        return new OooO0o(bundle.getInt(OooO0o.f6357OooOO0, -1), bundle.getByteArray(OooO0o.f6361OooOOO0), bundle.getInt(OooO0o.f6358OooOO0O, -1), bundle.getInt(OooO0o.f6359OooOO0o, -1));
    }

    @Override // o0oo0.OooOOOO.OooO00o
    public final void OooO0Oo() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO
    public final int OooO0o0(Object obj) {
        Pattern pattern = MediaCodecUtil.f7732OooO00o;
        return ((androidx.media3.exoplayer.mediacodec.OooO0o) obj).f7754OooO00o.startsWith("OMX.google") ? 1 : 0;
    }
}
