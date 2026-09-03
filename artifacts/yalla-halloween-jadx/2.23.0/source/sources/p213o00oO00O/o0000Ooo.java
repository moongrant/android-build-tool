package p213o00oO00O;

import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p205o00o0oO0.o00oOoo;
import p209o00o0oo0.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000Ooo extends o00O00OO implements OooO00o {
    public o0000Ooo(long j, long j2, o00oOoo.OooO00o oooO00o, boolean z) {
        super(oooO00o.f39392OooO0o, oooO00o.f39390OooO0OO, j, j2, z);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o(long j) {
        return ((Math.max(0L, j - this.f39523OooO0O0) * 8) * AnimationKt.MillisToNanos) / ((long) this.f39527OooO0o0);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return -1L;
    }
}
